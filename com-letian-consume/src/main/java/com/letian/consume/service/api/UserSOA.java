package com.letian.consume.service.api;

import com.letian.consume.service.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 10:42 2018/12/12
 * @version: 1.0.0
 */
@FeignClient(value = "com-letian-user")
public interface UserSOA {

    @RequestMapping(method = RequestMethod.POST,value = "/service/user/getUser")
    UserDTO getUser(String name);


}
