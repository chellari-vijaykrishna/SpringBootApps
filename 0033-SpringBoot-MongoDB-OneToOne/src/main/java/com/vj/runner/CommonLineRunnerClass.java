package com.vj.runner;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.vj.Application;
import com.vj.model.Passport;
import com.vj.model.Person;
import com.vj.repo.IPassportRepo;
import com.vj.repo.IPersonRepo;


@Component
public class CommonLineRunnerClass implements CommandLineRunner {

    private final Application application;

	@Autowired
	private IPassportRepo passRepo;

	@Autowired
	private IPersonRepo perRepo;

    CommonLineRunnerClass(Application application) {
        this.application = application;
    }
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started...!!!");
		
		Person person = new Person();
		person.setPersonId(new Random().nextInt(1000));
		person.setPersonName("Vijay");
		
		
		Passport passport = new Passport();
		passport.setPassportId(new Random().nextInt(1000));
		passport.setPassportName("India");
		
		person.setPassport(passport);
		perRepo.save(person);
		
		
		passport.setPerson(person);
		passRepo.save(passport);
		
		
		
	}

}
