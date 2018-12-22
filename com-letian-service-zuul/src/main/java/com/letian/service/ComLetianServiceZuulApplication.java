package com.letian.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@ComponentScan("com.letian.service")
public class ComLetianServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComLetianServiceZuulApplication.class, args);
    }

}

