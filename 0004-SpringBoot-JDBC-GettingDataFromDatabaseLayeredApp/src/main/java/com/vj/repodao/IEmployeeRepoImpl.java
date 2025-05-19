package com.vj.repodao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vj.model.Employees;

@Repository("empDao")
public class IEmployeeRepoImpl implements IEmployeeRepo {

	private static final String QUERY = "SELECT EMP_ID,FIRST_NAME,DEPARTMENT,SALARY FROM EMPLOYEES WHERE DEPARTMENT IN(?,?,?) ORDER BY DEPARTMENT";

	@Autowired
	public DataSource source;

	@Override
	public List<Employees> getEmpByDsng(List<String> desg) throws Exception {

		Connection con = source.getConnection();

		PreparedStatement statement = con.prepareStatement(QUERY);

		statement.setString(1, desg.get(0));
		statement.setString(2, desg.get(1));
		statement.setString(3, desg.get(2));

		ResultSet set = statement.executeQuery();

		List<Employees> employees = new ArrayList<Employees>();

		while (set.next()) {
			Employees emp = new Employees();
			emp.setEmpId(set.getInt(1));
			emp.setEmpName(set.getString(2));
			emp.setEmpDesg(set.getString(3));
			emp.setEmpSalary(set.getDouble(4));
			employees.add(emp);
		}

		return employees;
	}

}
