package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.Passport;
import com.vj.model.Person;
import com.vj.repo.IPassportRepo;
import com.vj.repo.IPersonRepo;

@Component
public class CommandLineRunnerClass implements CommandLineRunner{
	

	@Autowired
	private IPersonRepo personRepo;
	
	@Autowired
	private IPassportRepo passportRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started.......!!");
//		Passport passport= new Passport();
//		passport.setPassportNumber("INVIJ26082000");
//		passportRepo.save(passport);
//		
//		Person person = new Person();
//		person.setPersonName("Vijay");
//		person.setPassport(passport);
//		personRepo.save(person);
				
		
		System.out.println("Retrive");
		
		List<Object[]> ar = personRepo.joinsColumns();
		
		for(Object[] s:ar) {
			for(Object r:s) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
		
	}

}
