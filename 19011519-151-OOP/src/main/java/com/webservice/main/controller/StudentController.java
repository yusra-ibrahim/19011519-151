package com.webservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.main.entity.Student;
import com.webservice.main.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/saveOne")
	public Student saveOne(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@GetMapping("/display")
	public List<Student> getAllStudent() {
		return studentService.getAll();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteById(id);
	}

	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentService.updateByStudent(student);
	}

}
