package com.Divyanshu.repositories;

import java.util.List;

import com.Divyanshu.models.Employee;

public interface EmployeeRepository 
{
	void saveEmployee(Employee emp);
	Employee getEmployeeRecord(int eid);
	List<Employee> getList(String st);
	void updateOutStatus(String status,Employee emp);
}
