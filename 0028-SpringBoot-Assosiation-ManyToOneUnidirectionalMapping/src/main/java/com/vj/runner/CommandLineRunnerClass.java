package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.HobbiesManyToOne;
import com.vj.model.PersonInfoManyToOne;
import com.vj.repo.IHobbiesManyToOneRepo;
import com.vj.repo.IPersonInfoManyToOneRepo;

@Component
public class CommandLineRunnerClass implements CommandLineRunner{
	
	@Autowired
	private IHobbiesManyToOneRepo hobbiesRepo;
	
	@Autowired
	private IPersonInfoManyToOneRepo personRepo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.......!!");
		
		PersonInfoManyToOne person = new PersonInfoManyToOne();
		person.setPersonName("Vijay");
		personRepo.save(person);
		
		HobbiesManyToOne hobbie = new HobbiesManyToOne();
		hobbie.setHobbieTypeName("Techincal");
		hobbie.setInfo(person);
		hobbiesRepo.save(hobbie);
		
		
//		System.out.println("Retrive");
//		List<Object[]> ar = personRepo.joinColumns();
//		System.out.println(ar.toString());
//
//		for (Object[] s : ar) {
//			for (Object r : s) {
//				System.out.print(r + " ");
//			}
//			System.out.println();
//		}
	}

}
