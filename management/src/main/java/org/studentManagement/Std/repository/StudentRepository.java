package org.studentManagement.Std.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.studentManagement.Std.entity.student;


public interface StudentRepository extends JpaRepository<student, Long> {
	

}
