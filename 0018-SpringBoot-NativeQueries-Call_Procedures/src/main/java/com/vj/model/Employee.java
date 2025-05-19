package com.vj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	
	@Id
	private Integer ENO;
	@Column(length = 50)
	private String ENAME;
	@Column(length = 30)
	private String DESG;
	private Integer SALARY;

	
}
