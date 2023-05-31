package com.example.CustomerManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotNull
    private char sex;

    @NotNull
    private Integer age;

    @NotNull
    private String qualification;

    @NotNull
    private String notes;


    @OneToOne(cascade = CascadeType.ALL)

    private PermanentAddress permanentAddress;



    @OneToOne(cascade = CascadeType.ALL)

    private CommunicationAddress communicationAddress;



}


//{
//    "firstName":"",
//        "lastName":
//        "permanentAddress" :{
//
//        }
//        }