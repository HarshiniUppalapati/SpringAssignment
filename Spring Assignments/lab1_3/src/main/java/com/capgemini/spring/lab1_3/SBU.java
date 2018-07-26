package com.capgemini.spring.lab1_3;

import java.util.List;

public class SBU {
	private String sbuCode;
	private String sbuHead;
	private String sbuName;
	List<Employee> empList;
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU details\n----------\nsbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + "\nEmployee Details:----------\n" + empList;
	}
	
}
