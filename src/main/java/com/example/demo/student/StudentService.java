package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	public void newStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
		
		if (studentOptional.isPresent()) {
			throw new IllegalStateException("Email is already registered");
		}
		studentRepository.save(student);
	}

	public void deleteStudent(Long studentId) {
		boolean isExists = studentRepository.existsById(studentId);
		
		if (! isExists) {
			throw new IllegalStateException("Student Not exists");
		}
		studentRepository.deleteById(studentId);
	}

	@Transactional
	public void updateStudent(Student student) {
		Student studentObj = studentRepository.findById(student.getId())
		.orElseThrow(() -> new IllegalStateException("Student Not exists"));
		studentObj.setName(student.getName());
	}
	
}
