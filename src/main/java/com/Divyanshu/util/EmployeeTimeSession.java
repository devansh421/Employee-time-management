package com.Divyanshu.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeTimeSession 
{
	private Session ses;
	
	@Autowired
	public EmployeeTimeSession(SessionFactory fact)
	{
		ses=fact.openSession();
	}
	public Session getSession()
	{
		return ses;
	}
}
