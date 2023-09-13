package com.example.hhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hhs.model.Payroll;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long> {

}
