package com.wasim.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wasim.main.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
