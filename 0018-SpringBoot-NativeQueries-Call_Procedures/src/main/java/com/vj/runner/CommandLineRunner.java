package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vj.model.Employee;
import com.vj.service.IMovieService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {
		List<Employee> list = service.callProcedures("CLERK", "MANAGER");
		list.forEach(System.out::println);
		
		System.out.println(service.countAll());
	}

	
}
