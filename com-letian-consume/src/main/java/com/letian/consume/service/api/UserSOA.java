package com.letian.consume.service.api;

import com.letian.consume.service.dto.ErrorDTO;
import com.letian.consume.service.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 10:42 2018/12/12
 * @version: 1.0.0
 */
@FeignClient(value = "com-letian-user",fallback = ErrorDTO.class)
public interface UserSOA {

    @RequestMapping(method = RequestMethod.GET,value = "/service/user/getUser")
    String getUser(@RequestParam("name") String name);


}
