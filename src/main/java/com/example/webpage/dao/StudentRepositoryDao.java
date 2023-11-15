package com.example.webpage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webpage.models.Student;

public interface StudentRepositoryDao extends JpaRepository<Student,Long>{
    
}
