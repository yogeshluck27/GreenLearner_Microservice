package com.gl.propertiesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private User user;

    @Autowired
    private UserConfigDemo userConfigDemo;

    @GetMapping("/api/public/user")
    public String getUsers(){
        System.out.println(user.getSystemProps());
        return user.toString();
    }

    @GetMapping("/api/userConfig")
    public String getUserConfig(){
        return userConfigDemo.toString();
    }
}
