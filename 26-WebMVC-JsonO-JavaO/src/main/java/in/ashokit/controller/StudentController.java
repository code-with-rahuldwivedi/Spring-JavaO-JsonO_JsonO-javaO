package in.ashokit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public List<Student> getStudent() {
		ArrayList<Student> studentlist =new ArrayList<Student>();
		studentlist.add(new Student(1,"Rahul","Dwivedi"));
		studentlist.add(new Student(2,"Beeru","Nigam"));
		studentlist.add(new Student(3,"Aditya","Singh"));
		return studentlist;
		
	}
}
