package com.Divyanshu.services;

import java.util.List;

import com.Divyanshu.models.Employee;

public interface EmployeeService 
{
	void saveRecord(Employee emp);
	Employee getEmployee(int eid);
	List<Employee> getEmployeeInList();
	List<Employee> getEmployeeOutList();
}
