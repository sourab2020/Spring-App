package com.example.springjsp.SpringjSP.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springjsp.SpringjSP.DAO.Employee;
import com.example.springjsp.SpringjSP.DAO.EmployeeDAO;
import com.example.springjsp.SpringjSP.DAO.EmployeeDetails;
import com.example.springjsp.SpringjSP.DAO.Salary;
import com.example.springjsp.SpringjSP.DAO.SalaryDAO;



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
	
	public void addEmployee(Employee employee){
		employeeDAO.addEmployee(employee);
		
	}

}
