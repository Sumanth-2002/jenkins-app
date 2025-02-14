package com.ust.jenkins_app.repository;

import com.ust.jenkins_app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByRegNo(String regNo);
}
