
package org.studentManagement.Std.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.studentManagement.Std.entity.student;
import org.studentManagement.Std.service.impl.StudentService;

@Controller                          //spring MVC class to handle request
public class StudentController {
	
	private   StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//handler method to handle list students and return model and view
	
	@GetMapping("/students")
	public String listStudnts(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		
		return "students";                                    //view file...create in templates
		 
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//create student object to hold student form data
		student student=new student();
		model.addAttribute("student",student);
	       return "create_student";                   //view file
	} 
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
		
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentFrom(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_Student";
		
		}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, 
			@ModelAttribute("student")student student,
			Model model)
			 {
	
	//get student from databse ny id
		student existingStudent=studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		//save updated student object
		studentService.updateStudent(existingStudent);
		return"redirect:/students";
	
} 
	//handler method to delete request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
		
		
	}
}
















