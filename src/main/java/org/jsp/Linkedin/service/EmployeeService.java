package org.jsp.Linkedin.service;

import org.jsp.Linkedin.entity.Employee;

import org.jsp.Linkedin.responseStructure.ResponseStructure;

import java.util.List;

import org.jsp.Linkedin.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;

	public ResponseStructure<Employee> saveEmployee(Employee employee) {
	
		employee =  dao.saveEmployee(employee);
		ResponseStructure<Employee> rs = new ResponseStructure<>();
		rs.setStatus(200);
		rs.setMessage("employee saved successfully");
		rs.setBody(employee);
		return rs;
	}

	public ResponseStructure<List<Employee>> findAllEmployee() {
		ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
		
		List<Employee> allemp = dao.findAll();
		if(allemp.isEmpty()) {
			rs.setStatus(404);
			rs.setMessage("no employee ");
			rs.setBody(null);
			return rs;
		}
		
		rs.setStatus(200);
		rs.setMessage("List of employees");
		rs.setBody(allemp);
		return rs;
	}

	public ResponseStructure<List<Employee>> findAllActiveEmployee() {
		List<Employee> allActiveEmployee = dao.findAllActiveEmployee();
		ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
		
		if(allActiveEmployee.isEmpty()) {
			rs.setStatus(400);
			rs.setMessage("No active Employee found");
			rs.setBody(null);
		}
		
		else {
			rs.setStatus(200);
			rs.setMessage("List of all active employees");
			rs.setBody(allActiveEmployee);
		}
		return rs;
	}
	
	
	
}

















