package com.kodnest.SpringBoot.Programming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.SpringBoot.Programming.Entities.Employee;

public interface EmpRepository extends JpaRepository<Employee,String>{

}
