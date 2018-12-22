package com.letian.configclient.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 18:42 2018/12/22
 * @version: 1.0.0
 */
@Component
public class FanoutRecive {

    @RabbitListener(queues = "fanout.A")
    //@RabbitHandler
    public void aFanout(String context){
        System.err.println("fanout.A -----> " + context);
    }
    @RabbitListener(queues = "fanout.B")
    //@RabbitHandler
    public void bFanout(String context){
        System.err.println("fanout.B -----> " + context);
    }

    @RabbitListener(queues = "fanout.C")
    //@RabbitHandler
    public void cFanout(String context){
        System.err.println("fanout.C -----> " + context);
    }


}
