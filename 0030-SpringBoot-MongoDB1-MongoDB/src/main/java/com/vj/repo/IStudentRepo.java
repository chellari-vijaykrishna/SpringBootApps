package com.vj.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vj.model.Student;

public interface IStudentRepo extends MongoRepository<Student, String> {
	
	

}
