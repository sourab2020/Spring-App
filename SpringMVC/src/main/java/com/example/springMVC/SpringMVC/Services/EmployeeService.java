package com.example.springMVC.SpringMVC.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMVC.SpringMVC.DAO.Employee;
import com.example.springMVC.SpringMVC.DAO.EmployeeDAO;
import com.example.springMVC.SpringMVC.DAO.EmployeeDetails;
import com.example.springMVC.SpringMVC.DAO.Salary;
import com.example.springMVC.SpringMVC.DAO.SalaryDAO;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO employeeDAO = new EmployeeDAO();
	@Autowired
	SalaryDAO salaryDAO;
	public EmployeeDetails getEmployeeInformation(int id){
		
		Employee employee=employeeDAO.getEmployee(id);
		Salary salary=salaryDAO.getSalaryInformation(id);
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.setEmployeeNo(employee.getEmployeeNo());
		employeeDetails.setFirstNAme(employee.getFirstNAme());
		employeeDetails.setLastName(employee.getLastName());
		employeeDetails.setGender(employee.getGender());
		employeeDetails.setSalary(salary.getSalary());
		return employeeDetails;
	}
	
	public boolean updateEmployeeInformation(int employeeId,Employee employee) {			
		 boolean validation = employeeDAO.updateEmployeeInformation(employeeId,employee);
		 return validation;
	}

	public boolean addEmployeeInformation(Employee employee2) {
		// TODO Auto-generated method stub
		boolean EmployeeValidation = employeeDAO.addEmployeeInformation(employee2);
		boolean SalaryValidation = salaryDAO.addSalaryInformation(employee2);
		
		if(EmployeeValidation && SalaryValidation)
			return true;
		else
			return false;
	}
	
	public void displaySalary(){
		
	}

}
