package com.vj.service;


import com.vj.model.EmployeeDetails;

public interface IEmployeeService {
	public String registerEmployeeDetails(EmployeeDetails empInfo);
	public EmployeeDetails fetchEmployeePhoto(Integer id);
	public EmployeeDetails fetchEmployeeResume(Integer id);	
}
