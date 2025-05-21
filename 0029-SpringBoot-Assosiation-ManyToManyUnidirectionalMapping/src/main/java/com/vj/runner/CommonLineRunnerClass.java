package com.vj.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vj.model.Courses;
import com.vj.model.Student;
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

		
		Courses courses = new Courses();
		courses.setCoursesName("Telugu");
		coursesRepo.save(courses);
		Courses courses1 = new Courses();
		courses1.setCoursesName("Hindi");
		coursesRepo.save(courses1);
		Courses courses2 = new Courses();
		courses2.setCoursesName("English");
		coursesRepo.save(courses2);
		
		Student student = new Student();
		student.setStudentName("Vijay");
		student.setCourses(Set.of(courses, courses1, courses2));
		
		Student student1 = new Student();
		student1.setStudentName("Krishna");
		student1.setCourses(Set.of(courses, courses1, courses2));
		
		Student student2 = new Student();
		student2.setStudentName("Ram");
		student2.setCourses(Set.of(courses, courses1, courses2));
		
		studentRepo.save(student);
		studentRepo.save(student1);
		studentRepo.save(student2);
		
		System.out.println("Retrive::");
		
		Set<Object[]> ar = studentRepo.joinColumns();
		System.out.println(ar.toString());

		for (Object[] s : ar) {
			for (Object r : s) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		

	}

}
