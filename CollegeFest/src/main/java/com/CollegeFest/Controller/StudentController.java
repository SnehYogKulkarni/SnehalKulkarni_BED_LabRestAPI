package com.CollegeFest.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CollegeFest.Entity.Student;
import com.CollegeFest.Service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/home")
	public String showHome() {
		return "home";
	}

	@GetMapping("/showStudentForm")
	public String showStudentForm() {
		return "student-form";
	}

	@GetMapping("/list")
	public String getStudents(Model model) {
		List<Student> students = studentService.getStudents();
		model.addAttribute("students", students);
		return "student-list";
	}

	@RequestMapping("/save")
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		System.out.println("in save method....");
		studentService.save(student);
		return "redirect:/students/list";
	}

	@RequestMapping("/update")
	public String showFormForUpdate(Model model, @RequestParam("id") Long id) {
		Student student = studentService.findById(id);
		model.addAttribute("student", student);
		return "student-form";
	}

	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("id") Long id) {
		studentService.delete(id);
		return "redirect:/students/list";
	}

	@GetMapping("/access-denied")
	public String showAcceesdenied() {

		return "access-denied";
	}
}
