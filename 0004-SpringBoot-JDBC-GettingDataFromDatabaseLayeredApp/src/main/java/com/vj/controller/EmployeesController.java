package com.vj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vj.model.Employees;
import com.vj.service.IEmployeeServiceImpl;

@Controller("empController")
public class EmployeesController {
	
	//@Autowired
	private IEmployeeServiceImpl service;
	
	
    @Autowired
	public void setService(IEmployeeServiceImpl service) {
		this.service = service;
	}

	public List<Employees> getDsngs(List<String> str) throws Exception{
		System.out.println(str.toString());
		System.out.println(service.toString());
		return service.getDsngEmployees(str);
	}
}
