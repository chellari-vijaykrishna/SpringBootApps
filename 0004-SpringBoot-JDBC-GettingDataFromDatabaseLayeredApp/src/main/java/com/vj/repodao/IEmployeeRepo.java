package com.vj.repodao;

import java.util.List;

import com.vj.model.Employees;

public interface IEmployeeRepo {
	
	public List<Employees> getEmpByDsng(List<String> desg) throws Exception; 

}
