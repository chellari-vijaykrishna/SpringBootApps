package com.vj.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.repo.ICoursesRepo;
import com.vj.repo.IStudentRepo;

@Component
public class CommonLineRunnerClass implements CommandLineRunner {

	@Autowired
	private ICoursesRepo coursesRepo;

	@Autowired
	private IStudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started....!!!");
		System.out.println("Retrive:: Student Side");
		;

		Set<Object[]> ar = studentRepo.joinColumns();
		System.out.println(ar.toString());

		for (Object[] s : ar) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

		System.out.println("Retrive:: Courses Side");
		;

		Set<Object[]> arr = coursesRepo.joinColumns();
		System.out.println(arr.toString());

		for (Object[] s : arr) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}

	}

}
