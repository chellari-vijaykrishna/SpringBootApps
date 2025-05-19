package com.vj.repo;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("emp")
public class EmployeeRepo {
	
	private final static String QUREY="SELECT COUNT(*) FROM EMPLOYEES";

	@Autowired
	private DataSource source;
	
	public String getCount() throws Exception {
		Connection con = source.getConnection();
		PreparedStatement statement = con.prepareStatement(QUREY);
		ResultSet count = statement.executeQuery();
		//System.out.println(count);
		count.next();
		return count.getInt(1)+ " :Employees are there";
	}

}
