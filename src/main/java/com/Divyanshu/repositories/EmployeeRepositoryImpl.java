package com.Divyanshu.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Divyanshu.models.Employee;
import com.Divyanshu.repositories.EmployeeRepository;
import com.Divyanshu.util.EmployeeTimeSession;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public EmployeeRepositoryImpl(EmployeeTimeSession timeses)
	{
		ses=timeses.getSession();
		t=ses.getTransaction();
	}
	public void saveEmployee(Employee emp) 
	{
		t.begin();
		ses.save(emp);
		t.commit();
	}
	public Employee getEmployeeRecord(int eid) 
	{
		Employee emp=ses.get(Employee.class,eid);
		return emp;
	}
	public List<Employee> getList(String st) 
	{
		Query<Employee> q=ses.createQuery("from Employee where outstatus=:arg");
		q.setParameter("arg",st);
		return q.list();
	}
	public void updateOutStatus(String status,Employee emp) 
	{
		t.begin();
		emp.setOutstatus(status);
		t.commit();
	}
}
