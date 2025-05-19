package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.model.EmployeeDetails;

@Repository
public interface IEmployeeJPA extends JpaRepository<EmployeeDetails, Integer> {
	
	
	
}
