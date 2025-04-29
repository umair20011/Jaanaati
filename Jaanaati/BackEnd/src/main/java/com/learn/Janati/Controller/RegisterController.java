package com.learn.Janati.Controller;

import com.learn.Janati.Model.Register;
import com.learn.Janati.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/janati/register")
    public void addUser(@RequestBody Register register){

        registerService.addUser(register);

    }

}
