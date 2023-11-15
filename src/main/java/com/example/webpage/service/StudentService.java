package com.example.webpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webpage.dao.BookRepositoryDao;
import com.example.webpage.dao.StudentRepositoryDao;
import com.example.webpage.models.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepositoryDao studentDao;

    public int saveStudent(Student student) {
        studentDao.save(student);
        return 0;
    }


}
