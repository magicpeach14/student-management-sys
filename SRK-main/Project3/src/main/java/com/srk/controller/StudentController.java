package com.srk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srk.entity.Student;
import com.srk.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	//http://localhost:8080/savestd
	
	@PostMapping("/savestd")
	public String saveStudentDetails(@RequestBody() Student std) {
		
		String str=studentService.saveStudent(std);
		return str;
	}
	
	@DeleteMapping("/deletestd")
	public String deleteStdById(@RequestBody Student std) {
		
		String str=studentService.deleteStdById(std.getSid());
		
		return str;
	}
	
	@GetMapping("/getallstudents")
	public List<Student> getStudents(){
		
		List<Student> std=studentService.getAllStudents();
		
		return std;
	}
	
	@PutMapping("/updatestd")
    public String updateStudentDetails(@RequestBody Student std) {
		
		String str=studentService.updateStudent(std);
		return str;
	}
	
}
