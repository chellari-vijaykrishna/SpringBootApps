package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.repo.IHobbiesManyToOneRepo;
import com.vj.repo.IPersonInfoManyToOneRepo;

@Component
public class CommandLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IHobbiesManyToOneRepo hobbiesRepo;

	@Autowired
	private IPersonInfoManyToOneRepo personRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.......!!");
		System.out.println("Retrive");

		System.out.println("Person Side");

		List<Object[]> ar = personRepo.joinColumns();
		System.out.println(ar.toString());

		for (Object[] s : ar) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

		System.out.println("Hobbie Side");

		List<Object[]> arr = hobbiesRepo.joinColumns();
		System.out.println(arr.toString());

		for (Object[] s : arr) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

	}

}
