package com.vj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employees {
	
	private Integer empId;
	private String empName;
	private String empDesg;
	private Double empSalary;

}
