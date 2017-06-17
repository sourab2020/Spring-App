package com.example.springMVC.SpringMVC.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springMVC.SpringMVC.DAO.Employee;
import com.example.springMVC.SpringMVC.DAO.EmployeeDetails;
import com.example.springMVC.SpringMVC.Services.EmployeeService;

@Controller
public class TestController {
	@Autowired
	EmployeeService employeeService;
	int empID;
	@RequestMapping(value="/")
	public String getDetails(){
		return "address";
	}
	
	
	@RequestMapping(value="/EmployeeInformation.do")
	public String getEmployee(HttpServletRequest request,Model model){
		 empID = Integer.parseInt(request.getParameter("employeeId"));
		 System.out.println(employeeService +""+ empID);
		 EmployeeDetails employee = employeeService.getEmployeeInformation(empID);
		 model.addAttribute("Employee", employee);
		 return "Test";
		
	}

}
