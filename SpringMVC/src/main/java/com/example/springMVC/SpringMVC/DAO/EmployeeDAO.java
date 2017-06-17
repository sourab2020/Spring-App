package com.example.springMVC.SpringMVC.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	
	PreparedStatement pStatement = null;
	Connection con = DataBaseConnection.getConnection();
	public Employee getEmployee(int id){
		Employee e = null;
		ResultSet rs =	null;
		
		
		try {
			pStatement = con.prepareStatement("select emp_no, first_name, last_name, gender from employees where emp_no=?");
			pStatement.setInt(1, id);
			rs = pStatement.executeQuery();
			while(rs.next()){
				e = new Employee(Integer.parseInt(rs.getString("emp_no")), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"));
			}
		}catch(Exception e1){
			e1.printStackTrace();
		}
		return e;
		
	}
	public boolean updateEmployeeInformation(int employeeId,Employee employee) {
		boolean x=false;
		try {
			pStatement = con.prepareStatement("update employees set first_name = ?,last_name=?, gender=? where emp_no = ?");
			pStatement.setString(1, employee.getFirstNAme());
			pStatement.setString(2, employee.getLastName());
			pStatement.setString(3, employee.getGender());
			pStatement.setInt(4, employeeId);
			int rows=pStatement.executeUpdate();
			
			if(rows>0)
				x=true;
			else
				x=false;				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	
	return x;
	}

	public boolean addEmployeeInformation(Employee employee) {
		ResultSet rs = null;
		boolean addEmployee = false;
		try{
			pStatement = con.prepareStatement("INSERT INTO employees(emp_no,first_name, last_name, gender) VALUES (?, ?, ?, ?)");
			pStatement.setInt(1, employee.getEmployeeNo());
			pStatement.setString(2, employee.getFirstNAme());
			pStatement.setString(3, employee.getLastName());
			pStatement.setString(4, employee.getGender());
			int x=pStatement.executeUpdate();
			if(x>0)
				addEmployee=true;
			else
				addEmployee=false;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return addEmployee;
	}
	
}
