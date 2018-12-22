package com.letian.configclient.controller;

import com.letian.configclient.send.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 18:47 2018/12/22
 * @version: 1.0.0
 */

@RestController
public class RabbitController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${isMan}")
    private String isMan;


    @RequestMapping(value = "/hi")
    public String hi() {
        return name + "-->" + age + "--->" + isMan;
    }


    @Autowired
    private HelloSender helloSender;

    @GetMapping("/send")
    public String hello(int num) {
        int send = 0;
        for (int i = 1; i <= num; i++) {
            if (helloSender.sendDirect(i)) {
                send++;
            }
        }

        return "num=" + send;
    }


    @GetMapping("/sendTopic")
    public String sendTopic(int type) {
        if (type == 1){
            helloSender.sendTopic1();
        }else if(type == 2){
            helloSender.sendTopic2();
        }
        return "type=" + type;
    }

    @GetMapping("/sendFanout")
    public  String sendFanout(){
        helloSender.sendFanout();
        return "OK";
    }
}
