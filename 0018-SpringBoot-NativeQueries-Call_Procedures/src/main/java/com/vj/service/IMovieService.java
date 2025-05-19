package com.vj.service;

import java.util.List;

import com.vj.model.Employee;

public interface IMovieService {
	public List<Employee> callProcedures(String jobOne,String jobTwo);
	public Integer countAll();
}
