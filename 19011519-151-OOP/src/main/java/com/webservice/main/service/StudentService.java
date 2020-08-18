package com.webservice.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.main.entity.Student;
import com.webservice.main.repository.StudentInterface;

@Service
public class StudentService {

	@Autowired
	private StudentInterface studentInterface;

	public Student saveStudent(Student student) {
		return studentInterface.save(student);
	}

	public List<Student> getAll() {
		return studentInterface.findAll();
	}

	public Student getById(int id) {
		return studentInterface.findById(id).orElse(null);
	}

	public String deleteById(int id) {
		studentInterface.deleteById(id);
		return "record deleted";
	}

	public Student updateByStudent(Student student) {
		Student existingStudent = studentInterface.findById(student.getId()).orElse(null);
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setStudentRollNumber(student.getStudentRollNumber());
		existingStudent.setStudentSemeter(student.getStudentSemeter());
		existingStudent.setStudentSemeter(student.getStudentSemeter());
		return studentInterface.save(student);
	}

}
