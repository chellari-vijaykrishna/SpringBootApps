package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.repo.IHobbieRepo;
import com.vj.repo.IPersonInfoRepo;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IHobbieRepo hobbieRepo;

	@Autowired
	private IPersonInfoRepo personInfoRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.......!!");

		System.out.println("Retrive");

		List<Object[]> ar = personInfoRepo.joinColumns();
		System.out.println(ar.toString());

		System.out.println("Person Side");

		for (Object[] s : ar) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

		System.out.println("Hobbie Side");
		List<Object[]> arr = hobbieRepo.joinColumns();
		for (Object[] s : arr) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

	}

}
