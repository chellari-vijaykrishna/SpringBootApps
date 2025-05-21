package com.vj.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vj.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {
	
	@Query("select s.studentId,s.studentName,c.coursesId,c.coursesName from Student s join s.courses c")
	public Set<Object[]> joinColumns();

}
