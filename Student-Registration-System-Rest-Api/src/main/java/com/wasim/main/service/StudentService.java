package com.wasim.main.service;

import java.util.List;
import java.util.Optional;

import com.wasim.main.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();

	Student createStudent(Student student);

	Student updateStudent(long id, Student student);

	void deleteStudent(long id);

	Student editStudent(long id);

	

}
