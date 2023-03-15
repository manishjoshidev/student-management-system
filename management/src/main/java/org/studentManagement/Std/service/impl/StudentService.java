package org.studentManagement.Std.service.impl;

import java.util.List;

import org.studentManagement.Std.entity.student;

public interface StudentService {
     List<student>getAllStudents();
     student saveStudent(student student);
     student getStudentById(Long id);
     student updateStudent(student student);
     
     
     void deleteStudentById(Long id);
}
