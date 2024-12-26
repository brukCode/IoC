package com.ioc.day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employe {
	
	@Autowired
	Hr hr;
	
	private int depId;
	private String position;
	
	public void employe() {
		hr.setEmpId(5);
		hr.setEmpName("Bruk");
		hr.Hr();
		
	}
	
	public Employe(int depId, String position) {
		super();
		this.depId = depId;
		this.position = position;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employe [depId=" + depId + ", position=" + position + "]";
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	

}
