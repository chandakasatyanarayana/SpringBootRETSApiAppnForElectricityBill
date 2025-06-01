package com.sathya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.model.ElectricityBill;

@Repository
public interface ElectricityBillRepo extends JpaRepository<ElectricityBill, Integer> {

}

