package com.greatlearning.library;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

	public List<Student> searchBy(String name, String country);

}
