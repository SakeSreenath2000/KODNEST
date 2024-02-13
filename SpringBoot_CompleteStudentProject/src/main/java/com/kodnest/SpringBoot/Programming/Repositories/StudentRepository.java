package com.kodnest.SpringBoot.Programming.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.SpringBoot.Programming.Entities.Student;

public interface StudentRepository extends JpaRepository<Student,String>{

}
