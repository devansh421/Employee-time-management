package com.Divyanshu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.Employee;
import com.Divyanshu.repositories.EmployeeRepository;
import com.Divyanshu.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired private EmployeeRepository repo;

	public void saveRecord(Employee emp) 
	{
		emp.setOutstatus("in");
		repo.saveEmployee(emp);
	}
	public Employee getEmployee(int eid) 
	{
		return repo.getEmployeeRecord(eid);
	}
	public List<Employee> getEmployeeInList() 
	{
		return repo.getList("in");
	}
	public List<Employee> getEmployeeOutList() 
	{
		return repo.getList("out");
	}
	
}
