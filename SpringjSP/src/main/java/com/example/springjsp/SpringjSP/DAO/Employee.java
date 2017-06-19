package com.example.springjsp.SpringjSP.DAO;

import java.util.Date;

public class Employee {
	private int employeeNo;
	private String firstNAme;
	private String lastName;
	private String gender;
	private	Date birthdate;
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	private Date hireDate;
	private String salary;
	private Date fromdate;
	private Date todate;
	private String deptnumber;
	private String deptname;
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	public String getDeptnumber() {
		return deptnumber;
	}
	public void setDeptnumber(String deptnumber) {
		this.deptnumber = deptnumber;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getFirstNAme() {
		return firstNAme;
	}
	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(int employeeNo, String firstNAme, String lastName, String gender) {
		super();
		this.employeeNo = employeeNo;
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
	}
	public Employee(String firstName, String lastName, String gender) {
		
		// TODO Auto-generated constructor stub
		this.firstNAme = firstNAme;
		this.lastName = lastName;
		this.gender = gender;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
}
