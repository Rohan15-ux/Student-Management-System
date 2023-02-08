package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;
import com.example.demo.service.SService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class Homecontroller {
	
	@Autowired
	private SService s;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/view")
	public String view() {
		return "view";
	}
	
	@PostMapping("/register")
	public String addStudent(@ModelAttribute @Valid Student student, HttpSession ses) {
		s.addStudent(student);
		ses.setAttribute("msg", "Employee Added Successfully");
		return "view";
	}
	
	@GetMapping("/edit/{roll}")
	public String updateStudent(@PathVariable int roll, Model m) {
		Student e=s.getStdbyroll(roll);
		m.addAttribute("student_management",e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateEmp(@ModelAttribute @Valid Student student, HttpSession session) {
		s.addStudent(student);
		session.setAttribute("msg", "Student Data Update Sucessfully..");
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{roll}")
	public String deleteStudent(@PathVariable int roll, HttpSession ses) {
		s.deleteStd(roll);
		ses.setAttribute("msg","Student Data Deleted Successfully");
		return "view";
	}
}
