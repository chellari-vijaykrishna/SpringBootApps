package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vj.model.Employees;
import com.vj.repodao.IEmployeeRepo;

@Service("empService")
public class IEmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public List<Employees> getDsngEmployees(List<String> list) throws Exception {
		System.out.println(list.toString());
		return repo.getEmpByDsng(list);
	}

}
