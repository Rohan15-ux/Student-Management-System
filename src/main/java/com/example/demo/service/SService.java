package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepoInterface;

@Service
public class SService {
	
	@Autowired
	private StudentRepoInterface repo;
	
	public void addStudent(Student s) {
		repo.save(s);
	}
	
	public List<Student> getAllEmp() {
		return repo.findAll();
	}
	
	public Student getStdbyroll(int roll) {
		Optional<Student> e=repo.findByroll(roll);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteStd(int roll) {
		repo.deleteByroll(roll);
	}
}

