package org.jsp.Linkedin.entity;

import org.jsp.Linkedin.Experience;
import org.jsp.Linkedin.Status;
import org.jsp.Linkedin.util.AddressStatus;
import org.jsp.Linkedin.util.AddressType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity

public class Employee {
	private int id;
	private String name;
	private String email;
	private long phone ;
	private double salary;
	private String password;
	private Experience experience = Experience.EXPERIENCE;
	private Experience status = EmployeeStatus.ACTIVE;
	
}

















