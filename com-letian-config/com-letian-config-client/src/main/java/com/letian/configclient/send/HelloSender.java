package com.letian.configclient.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 16:12 2018/12/22
 * @version: 1.0.0
 */

@Component
public class HelloSender {

   @Autowired
   private AmqpTemplate rabbitTemplate;

    public Boolean sendDirect(int currNum) {
        String context = "hello ---->" + new Date() + "---> " + currNum;
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
        return true;
    }


    public void sendTopic1() {
        String context = "hi, 李四";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void sendTopic2() {
        String context = "hi, 王五";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }


    public void sendFanout(){
        String context = "hi, fanout msg ";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
    }

}
