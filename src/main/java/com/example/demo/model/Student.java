package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="students")
public class Student {
	
	@Id
	@NotNull
	private int roll;
	private String name;
	@Min(1)
	@Max(12)
	private int std;
	private int marks;
	private int phone;
	private String address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", std=" + std + ", marks=" + marks + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
}
