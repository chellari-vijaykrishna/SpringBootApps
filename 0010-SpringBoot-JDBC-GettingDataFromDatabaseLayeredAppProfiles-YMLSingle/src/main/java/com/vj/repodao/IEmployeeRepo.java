package com.vj.repodao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vj.model.Employees;
@Repository
public interface IEmployeeRepo {
	
	public List<Employees> getEmpByDsng(List<String> desg) throws Exception; 

}
