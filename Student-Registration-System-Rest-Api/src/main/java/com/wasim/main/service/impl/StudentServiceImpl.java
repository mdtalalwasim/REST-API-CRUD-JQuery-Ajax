package com.wasim.main.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wasim.main.entity.Student;
import com.wasim.main.repository.StudentRepository;
import com.wasim.main.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(long id, Student student) {
		// TODO Auto-generated method stub
		student.setId(id);
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student editStudent(long id) {
		// TODO Auto-generated method stub
		 Optional<Student> student = studentRepository.findById(id);
		 if(student.isPresent()) {
			 
			 return student.get();
		 }
		 return null;
	}
	
	

}
