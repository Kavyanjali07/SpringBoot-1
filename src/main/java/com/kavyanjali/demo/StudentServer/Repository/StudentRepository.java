package com.kavyanjali.demo.StudentServer.Repository;

import com.kavyanjali.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}