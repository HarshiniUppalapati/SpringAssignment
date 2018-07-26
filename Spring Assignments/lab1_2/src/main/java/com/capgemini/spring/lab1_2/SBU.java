package com.capgemini.spring.lab1_2;

public class SBU {

	private String sbuCode;
	private String sbuHead;
	private String sbuName;
	
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
	
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName + "]";
	}
	
	
}
