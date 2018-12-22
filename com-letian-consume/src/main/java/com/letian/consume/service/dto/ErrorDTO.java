package com.letian.consume.service.dto;

import com.letian.consume.service.api.UserSOA;
import org.springframework.stereotype.Component;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 19:29 2018/12/18
 * @version: 1.0.0
 */
@Component
public class ErrorDTO implements UserSOA {

    @Override
    public String getUser(String name) {
        return "熔断机制触发!!!";
    }
}
