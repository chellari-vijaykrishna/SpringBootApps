package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.Tuorist;
import com.vj.repo.ITuoristRepo;

@Component
public class CommonLineRunnerClass implements CommandLineRunner {

	@Autowired
	private ITuoristRepo touRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started...!!!");

//		Tuorist tuorist = new Tuorist("Vijay", "Mlg", 24f, "IND4512549", 9381471084L, true, 6, LocalDateTime.now().plusYears(5));
//
//		touRepo.save(tuorist);

		List<Tuorist> tuorists = touRepo.findByName("Vijay");

		tuorists.forEach(System.out::println);

		List<Tuorist> tuoristss = touRepo.findByName1("Vijay", 24f);

		tuoristss.forEach(System.out::println);

		List<Object[]> tuoristsss = touRepo.findByName2(true, 24f);

		for (Object[] o : tuoristsss) {

			for (Object oo : o) {
				System.out.print(oo + " ");
			}
			System.out.println();
		}

	}

}
