package com.vj.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.EmployeeDetails;
import com.vj.repo.IEmployeeJPA;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeJPA repo;

	@Override
	public String registerEmployeeDetails(EmployeeDetails empInfo) {
		return repo.save(empInfo).getEmpId() + " :: Saved";
	}
	
	@Override
	public EmployeeDetails fetchEmployeePhoto(Integer id) {
		Optional<EmployeeDetails> emp = repo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return new EmployeeDetails();
		}
	}

	@Override
	public EmployeeDetails fetchEmployeeResume(Integer id) {
		Optional<EmployeeDetails> emp = repo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return new EmployeeDetails();
		}
	}
}
