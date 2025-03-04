package org.jsp.Linkedin.controller;

import java.util.List;

import org.jsp.Linkedin.entity.Employee;
import org.jsp.Linkedin.responseStructure.ResponseStructure;
import org.jsp.Linkedin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service; 

	@PostMapping
	public ResponseStructure<Employee> saveEmployee(@RequestBody Employee employee){
		return service.saveEmployee(employee);
	}
	
	@GetMapping
	public ResponseStructure<List<Employee>> fetchAllEmployee(){
		return service.findAllEmployee();
	}
	
	@GetMapping("/statuc/active")
	public ResponseStructure<List<Employee>> findActiveEmployees()
	{
		return service.findAllActiveEmployee();
	}
}
