package com.ioc.day1;

import org.springframework.stereotype.Component;

@Component
public class Hr {

	private int empId;
	private String empName;
	
	public void position() {


	
	System.out.println("presdent");
	
	}
		
		

	public Hr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
	
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Hr [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public void Hr() {
		System.out.println("Emplye ID :" + empId  + " Emploe Name: "+ empName);
}
//	
		
}
