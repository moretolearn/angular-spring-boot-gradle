package com.ram;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/list")
	public List<Employee> getEmployees(){
		return List.of(new Employee(1, "mohan", 20),new Employee(2, "ram", 21),new Employee(3, "reddy", 22));
	}
}
