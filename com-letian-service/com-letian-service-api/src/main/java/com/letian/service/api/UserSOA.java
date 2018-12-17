package com.letian.service.api;

import com.letian.service.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
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

    @RequestMapping(method = RequestMethod.GET,value = "/service/user/getUser")
    UserDTO getUser(String name);


}
