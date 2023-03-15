package org.studentManagement.Std.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.studentManagement.Std.entity.student;
import org.studentManagement.Std.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public student saveStudent(student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public student updateStudent(student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
