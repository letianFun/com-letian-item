package com.letian.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启动一个服务注册中心
@EnableEurekaServer
public class ComLetianRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComLetianRegisterApplication.class, args);
    }
}
