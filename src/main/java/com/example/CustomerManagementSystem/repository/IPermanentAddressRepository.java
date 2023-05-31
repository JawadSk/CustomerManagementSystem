package com.example.CustomerManagementSystem.repository;

import com.example.CustomerManagementSystem.model.PermanentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermanentAddressRepository extends JpaRepository<PermanentAddress,Integer> {
}
