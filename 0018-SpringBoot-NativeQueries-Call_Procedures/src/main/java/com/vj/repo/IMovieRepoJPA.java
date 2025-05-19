package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.vj.model.Employee;

@Transactional
public interface IMovieRepoJPA extends JpaRepository<Employee, Integer> {
	
}
