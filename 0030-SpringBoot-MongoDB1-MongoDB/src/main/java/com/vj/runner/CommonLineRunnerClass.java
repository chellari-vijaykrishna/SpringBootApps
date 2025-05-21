package com.vj.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.vj.model.Student;
import com.vj.repo.IStudentRepo;

@Component
public class CommonLineRunnerClass implements CommandLineRunner {

	@Autowired
	private IStudentRepo repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner Started...!!!");

//		Student student = new Student();
//
//		student.setStudId(1);
//		student.setStudName("Vijay");
//		student.setStudSection("A");
//		student.setStudSubjectCount(6);
//		
//		Student student1 = new Student();
//
//		student1.setStudId(2);
//		student1.setStudName("Krishna");
//		student1.setStudSection("A");
//		student1.setStudSubjectCount(6);
//		
//		Student student2 = new Student();
//
//		student2.setStudId(3);
//		student2.setStudName("Ram");
//		student2.setStudSection("A");
//		student2.setStudSubjectCount(6);
//
//		repo.saveAll(List.of(student, student1, student2));
		
		
//		repo.deleteById("682c7d1b360d0b51ce41f7e4");
//		repo.deleteById("682c7d1b360d0b51ce41f7e5");
//		repo.deleteById("682c7d1b360d0b51ce41f7e6");
//		repo.deleteById("682c7d68c2a3511e726386da");
//		repo.deleteById("682c7d68c2a3511e726386db");
//		repo.deleteById("682c7d68c2a3511e726386dc");
		
		//Optional<Student> optional = repo.findById("682c7d1b360d0b51ce41f7e4");
		
		
		//System.out.println(optional.get());
		
		String[]arg = {"studName"};
		
		Sort sort = Sort.by(Direction.ASC, arg);
		
		List<Student> students =repo.findAll(sort);
		
		students.forEach(System.out::println);
		
		System.out.println();
	}

}
