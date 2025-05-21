package com.vj.repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vj.model.Courses;

public interface ICoursesRepo extends JpaRepository<Courses, Integer> {
	@Query("select s.studentId,s.studentName,c.coursesId,c.coursesName from Courses c join c.student s")
	public Set<Object[]> joinColumns();
}
