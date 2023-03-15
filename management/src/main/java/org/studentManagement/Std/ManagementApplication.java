package org.studentManagement.Std;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.studentManagement.Std.entity.student;
import org.studentManagement.Std.repository.StudentRepository;

@SpringBootApplication
public class ManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}
    @Autowired
    private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		student student1=new student(null, "Manish","joshi","joshi8763@gmial.com");
//		studentRepository.save(student1);
//		
//		student student2=new student(null, "niraj","negi","mitthu@gmail.com");
//		 studentRepository.save(student2);
//	
//	    student student3=new student(null,"deepak","kandari","kingkong@gmail.com");
//	    studentRepository.save(student3);
	}

}
