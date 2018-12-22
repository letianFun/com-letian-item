package com.letian.service.controller;


import com.letian.service.api.UserSOA;
import com.letian.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/service/user")
public class UserController implements UserSOA {

    @Override
    @RequestMapping("/getUser")
    public String getUser(String name) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setAga(8081);
        userDTO.setMan(true);
        return userDTO.toString();
    }
}
