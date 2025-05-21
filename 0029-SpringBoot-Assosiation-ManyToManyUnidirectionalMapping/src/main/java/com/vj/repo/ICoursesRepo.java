package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.model.Courses;

public interface ICoursesRepo extends JpaRepository<Courses, Integer> {

}
