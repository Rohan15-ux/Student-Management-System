package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

public interface StudentRepoInterface extends JpaRepository<Student, Integer> {

	void deleteByroll(int roll);

	Optional<Student> findByroll(int roll);

}
