package org.jsp.Linkedin.dao;

import java.util.List;

import org.jsp.Linkedin.entity.Employee;
import org.jsp.Linkedin.repository.EmployeeRepository;
import org.jsp.Linkedin.responseStructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao{

	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public List<Employee> findAll(){
		return repo.findAll();
	}

	public List<Employee> findAllActiveEmployee() {
		return repo.findAllActiveEmployee();
	}
}
