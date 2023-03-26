package com.example.demo1.models;



public class Input {
	public String firstName;
	public String secondName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
	public String toString() {
		return "Input [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
	
	

}
