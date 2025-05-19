package com.vj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vj.service.IMovieService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.........!!!");
		//Integer res =  service.addMovieWithInsertQ(302,"Kalki 2810 AD", 9.9d, 2026);
		//System.out.println(res);
		
		Integer ress =  service.countAllRecords();
		System.out.println(ress);
	}

}
