package com.example.CustomerManagementSystem.repository;

import com.example.CustomerManagementSystem.model.CommunicationAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommunicationAddressRepository extends JpaRepository<CommunicationAddress,Integer> {
}
