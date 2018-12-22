package com.letian.configclient.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 16:18 2018/12/22
 * @version: 1.0.0
 */
@Component

public class DirectReceiver {
    @RabbitListener(queues = "hello")
    //@RabbitHandler
    public void process(String hello) {
        System.err.println("Receiver  : " + hello);
    }

    @RabbitListener(queues = "hello")
    //@RabbitHandler
    public void reciver(String hello){
        System.err.println("Copy --->" + hello + "Copy <--->" );
    }

}
