package com.Divyanshu.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int eid;
	@Column(length = 50)
	private String name;
	@Column(length = 100)
	private String department;
	@Column(length = 3)
	private String outstatus;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOutstatus() {
		return outstatus;
	}
	public void setOutstatus(String outstatus) {
		this.outstatus = outstatus;
	}
	
}
