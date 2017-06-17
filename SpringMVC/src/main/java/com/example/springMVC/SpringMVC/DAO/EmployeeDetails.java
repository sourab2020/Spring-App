package com.example.springMVC.SpringMVC.DAO;

import java.sql.Date;

public class EmployeeDetails {
	 int employeeNo;
	private Date birthDate;
	private String firstName;
	private String lastName;
	private String gender;
	private Date hireDate;
	private Double salary;
	private Date fromdate;
	private Date todate;
	private String deptnumber;
	private String deptname;
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstNAme(String firstName) {
		this.firstName = firstName;
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
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public EmployeeDetails(int employeeNo, String firstName, String lastName, String gender) {
		super();
		this.employeeNo = employeeNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public EmployeeDetails(String firstName, String lastName, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public EmployeeDetails(int employeeNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
		super();
		this.employeeNo = employeeNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
	}
	public EmployeeDetails(int employeeNo, Date birthDate, String firstName, String lastName, String gender,
			Date hireDate, Double salary, Date fromdate, Date todate, String deptnumber, String deptname) {
		super();
		this.employeeNo = employeeNo;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.salary = salary;
		this.fromdate = fromdate;
		this.todate = todate;
		this.deptnumber = deptnumber;
		this.deptname = deptname;
	}
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(int employeeNo, String firstName, String lastName, String gender, Date hireDate,
			String deptname,Double salary) {
		super();
		this.employeeNo = employeeNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.salary = salary;
		this.deptname = deptname;
	}
	
}
