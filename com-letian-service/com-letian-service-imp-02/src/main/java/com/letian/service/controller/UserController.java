package com.letian.service.controller;


import com.letian.service.api.UserSOA;
import com.letian.service.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/service/user")
public class UserController implements UserSOA {

    @Override
    @PostMapping("/getUser")
    public UserDTO getUser(String name) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(name);
        userDTO.setAga(8082);
        userDTO.setMan(false);
        return userDTO;
    }
}
