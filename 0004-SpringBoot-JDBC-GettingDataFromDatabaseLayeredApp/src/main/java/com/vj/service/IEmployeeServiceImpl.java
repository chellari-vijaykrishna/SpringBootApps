package com.vj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.model.Employees;
import com.vj.repodao.IEmployeeRepoImpl;

@Service("empService")
public class IEmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepoImpl repo;

	@Override
	public List<Employees> getDsngEmployees(List<String> list) throws Exception {
		System.out.println(list.toString());
		return repo.getEmpByDsng(list);
	}

}
