package com.vj.service;

import java.util.List;

import com.vj.model.Employees;

public interface IEmployeeService {

	public List<Employees> getDsngEmployees(List<String> list) throws Exception;

}
