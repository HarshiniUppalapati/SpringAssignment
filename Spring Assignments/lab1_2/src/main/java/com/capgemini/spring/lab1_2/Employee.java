package com.capgemini.spring.lab1_2;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private int age;
	private SBU businessUnit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	@Override
	public String toString() {
		return "Employee Details\n--------------\n"
				+ "Employee [empId=" + employeeId + ", empName=" + employeeName + ", empSal=" + salary + ", empAge="
				+ age + "\nsbu details=" + businessUnit + "]";
	}
	
	
}
