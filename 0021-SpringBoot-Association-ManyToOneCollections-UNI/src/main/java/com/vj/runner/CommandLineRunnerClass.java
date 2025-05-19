package com.vj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.Book;
import com.vj.model.Student;
import com.vj.service.IBookStudentService;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IBookStudentService service;

	@Override
	public void run(String... args) throws Exception {

		service.registerBookInfo(new Book(1,"Telugu"));
		
		
		service.registerStudentInfo(new Student(1,"Vijay",new Book(1,"Telugu")));
		service.registerStudentInfo(new Student(2,"Krishna",new Book(1,"Telugu")));
		service.registerStudentInfo(new Student(3,"ram",new Book(1,"Telugu")));

	}

}
