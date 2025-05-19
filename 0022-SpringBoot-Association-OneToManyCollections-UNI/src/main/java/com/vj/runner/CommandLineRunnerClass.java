package com.vj.runner;

import java.util.Set;

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
		service.registerBookInfo(new Book(1,"Hindi"));
		service.registerBookInfo(new Book(1,"English"));
		
		Set<Book> listBooks = Set.of(new Book(1,"Telugu"),new Book(2,"Hindi"),new Book(3,"English"));
		
		System.out.println(service.registerStudentInfo(new Student(1, "Vijay", listBooks)));

	}

}
