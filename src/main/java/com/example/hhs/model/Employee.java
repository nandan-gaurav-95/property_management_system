package com.example.hhs.model;

//Jay Shree Ram
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
//@Entity
//@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long emp_id;
	    private String firstName;
	    private String lastName;
	    private Date dateOfHiring;
	    private Date dateOfLeaving;
	    private String address;
	    private String contactNumber;
	    private Double salary;
	    private Double pfContribution;
	    private Double loanAmount;
	    
}