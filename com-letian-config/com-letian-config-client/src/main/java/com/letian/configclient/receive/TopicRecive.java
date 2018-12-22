package com.letian.configclient.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 18:19 2018/12/22
 * @version: 1.0.0
 */
@Component
public class TopicRecive {

    @RabbitListener(queues = "topic.message")
    //@RabbitHandler
    public void topicReciveMessage(String context){
        System.err.println("topic.message<-----> ************ ----->" +context );
    }

    @RabbitListener(queues = "topic.messages")
    //@RabbitHandler
    public void topicReciveMessages(String context){
        System.err.println("topic.messages<----> ############# ----->" +context );
    }
}
