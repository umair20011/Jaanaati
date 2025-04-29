package com.learn.Janati.Service;

import com.learn.Janati.Model.Register;
import com.learn.Janati.Repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class RegisterService {

      @Autowired
      RegisterRepository registerRepository;

      public void addUser(Register register){

           registerRepository.save(register);

      }

}
