package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.repo.IPassportRepo;
import com.vj.repo.IPersonRepo;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IPersonRepo personRepo;

	@Autowired
	private IPassportRepo passportRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.......!!");

		System.out.println("Retrive");

		List<Object[]> ar = passportRepo.joinsColumns();

		for (Object[] s : ar) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}

}
