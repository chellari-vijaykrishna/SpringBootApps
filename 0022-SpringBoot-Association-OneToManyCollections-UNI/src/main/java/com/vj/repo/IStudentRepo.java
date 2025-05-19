package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {

}
