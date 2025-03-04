package org.jsp.Linkedin.repository;

import java.util.List;

import org.jsp.Linkedin.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("select e from Employee e where e.status = 'ACTIVE'")
	List<Employee> findAllActiveEmployee();

}
