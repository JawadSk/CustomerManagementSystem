package com.example.CustomerManagementSystem.controller;

import com.example.CustomerManagementSystem.model.Users;
import com.example.CustomerManagementSystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/save")
    public String inserUser(@Valid @RequestBody Users users){

        return userService.addUser(users);
    }

    @GetMapping(value = "/read/cms/{id}")
    public Users getUserBasedOnId(@PathVariable Integer id){

        return userService.getUserbyId(id);
    }

    @PutMapping(value = "/Update/cms/save/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Integer id, @RequestBody Users users){

        HttpStatus status;
        String msg=null;

        if(id!=null)
        {
            try{
                userService.updateById(id , users);
                status = HttpStatus.OK;
                msg = "User updated sucessfully";
            }catch (Exception e){
                msg = "Enter valid information";
                status = HttpStatus.BAD_REQUEST;
            }

        }
        else
        {
            msg = "Invalid User";
            status = HttpStatus.FORBIDDEN;
        }

        return new ResponseEntity<String>(msg , status);
    }



    @DeleteMapping(value = "delete/cms/delete/{id}")
    public void removeUserById(@PathVariable Integer id){

        userService.deleteUserBasedOnId(id);
    }
}
