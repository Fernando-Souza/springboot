package com.udemy.dao;

import com.udemy.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

}
