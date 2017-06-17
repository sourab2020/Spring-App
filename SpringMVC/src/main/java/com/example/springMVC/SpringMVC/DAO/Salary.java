package com.example.springMVC.SpringMVC.DAO;

import java.sql.Date;

public class Salary {
	private int employeeNumber;
	private double salary;
	private Date fromDate;
	private Date toDate;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Salary(int employeeNumber, double salary, Date fromDate, Date toDate) {
		super();
		this.employeeNumber = employeeNumber;
		this.salary = salary;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public Salary() {
		// TODO Auto-generated constructor stub
	}
	
	
}

