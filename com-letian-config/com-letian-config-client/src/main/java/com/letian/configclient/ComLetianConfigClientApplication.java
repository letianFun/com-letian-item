package com.letian.configclient;

import com.letian.configclient.send.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RefreshScope
public class ComLetianConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComLetianConfigClientApplication.class, args);
    }
}

