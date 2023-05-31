package com.example.CustomerManagementSystem.service;

import com.example.CustomerManagementSystem.model.Users;
import com.example.CustomerManagementSystem.repository.IUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;
    public String addUser(Users users) {

         Users obj = userRepository.save(users);

        if(obj!=null){

            return "Added list of User.....!!!";
        }
        else{

            return "Could not added...!!!";
        }
    }

    public Users getUserbyId(Integer id) {

        return userRepository.findById(id).get();
    }

   // @Transactional
    public String updateById(Integer id, Users users) {

       Users userData= userRepository.findById(id).get();
        if(userData==null){
            return "Student with id "+id + " is not present";
        }else{
            userData.setFirstName(users.getFirstName());
            userData.setLastName(users.getLastName());
            userData.setAge(users.getAge());
            userData.setSex(users.getSex());
            userData.setQualification(users.getQualification());
            userData.setPermanentAddress(users.getPermanentAddress());
            userData.setCommunicationAddress(users.getCommunicationAddress());
            userData.setNotes(users.getNotes());

            userRepository.save(userData);

            return "Student with id "+id + " updated successfully";
        }


    }

    public void deleteUserBasedOnId(Integer id) {

        userRepository.deleteById(id);
    }
}
