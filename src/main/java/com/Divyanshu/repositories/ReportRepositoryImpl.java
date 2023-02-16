package com.Divyanshu.repositories;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Divyanshu.models.TimeInfo;
import com.Divyanshu.repositories.ReportRepository;
import com.Divyanshu.util.EmployeeTimeSession;

@Repository
public class ReportRepositoryImpl implements ReportRepository 
{
	private Session ses;
	
	@Autowired
	public ReportRepositoryImpl(EmployeeTimeSession ts)
	{
		ses=ts.getSession();
	}
	public List<TimeInfo> getDatewiseCADateList(LocalDate date) 
	{
		Query<TimeInfo> q=ses.createQuery("from TimeInfo where date=:arg");
		q.setParameter("arg",date);
		return q.list();
	}
}
