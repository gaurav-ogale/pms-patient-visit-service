package com.citius.model;

public class getPatient {

	private String fname;
	
	private String lName;
	
	private String number;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "getPatient [fname=" + fname + ", lName=" + lName + ", number=" + number + "]";
	}
	
	
	
	
	
}
