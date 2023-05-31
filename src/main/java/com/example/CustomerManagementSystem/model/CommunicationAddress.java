package com.example.CustomerManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class CommunicationAddress {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @NotNull
    private Integer houseNumber;

    @NotEmpty
    private String street;

    @NotEmpty
    private String landmark;

    @NotEmpty
    private String city;

    @NotEmpty
    private String state;

  @NotNull
    private Integer pin;


}
