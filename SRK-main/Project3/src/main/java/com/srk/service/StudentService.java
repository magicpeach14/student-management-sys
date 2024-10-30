package com.srk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srk.entity.Student;
import com.srk.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	public String saveStudent(Student std) {
		
		studentRepo.save(std);
		
		return "Student record inserted successfully";
	}

	public String deleteStdById(long sid) {
		
		studentRepo.deleteById(sid);
		return "Student record deleted successfully";
	}

	public List<Student> getAllStudents() {
		
		List<Student> stds=studentRepo.findAll();
		return stds;
	}

	public String updateStudent(Student std) {
		
		Student std1=studentRepo.findById(std.getSid()).get();
		
		std1.setCollgename(std.getCollgename());
		std1.setEmail(std.getEmail());
		std1.setName(std.getName());
		
		studentRepo.save(std1);
		return "Student record updated successfully";
	}

}
