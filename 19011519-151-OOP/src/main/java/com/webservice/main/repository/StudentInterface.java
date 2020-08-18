package com.webservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.main.entity.Student;

public interface StudentInterface extends JpaRepository<Student, Integer> {

}
