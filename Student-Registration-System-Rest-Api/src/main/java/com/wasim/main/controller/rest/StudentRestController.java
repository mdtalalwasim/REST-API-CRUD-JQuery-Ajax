package com.wasim.main.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wasim.main.entity.Student;
import com.wasim.main.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@Autowired
	StudentService studentService;
	
	/*
	 * @GetMapping("/student") public List<Student> getAllStudent(HttpServletRequest
	 * request){ List<Student> studentList = new ArrayList<>(); studentList
	 * =studentService.getAllStudent();
	 * 
	 * return studentList; }
	 */
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
	}
	
	
	@PostMapping("/student")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/edit/{id}")
	public ResponseEntity<Student> editStudent(@PathVariable("id") long id){
		return new ResponseEntity<Student>(studentService.editStudent(id), HttpStatus.OK);
		
	}
	@PutMapping("/edit/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student){
		return new ResponseEntity<Student>(studentService.updateStudent(id, student), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") long id){
		studentService.deleteStudent(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

}
