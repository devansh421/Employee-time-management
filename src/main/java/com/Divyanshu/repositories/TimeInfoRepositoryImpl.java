package com.Divyanshu.repositories;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Divyanshu.models.TimeInfo;
import com.Divyanshu.repositories.TimeInfoRepository;
import com.Divyanshu.util.EmployeeTimeSession;

@Repository
public class TimeInfoRepositoryImpl implements TimeInfoRepository 
{
	private Session ses;
	private Transaction t;
	
	@Autowired
	public TimeInfoRepositoryImpl(EmployeeTimeSession time)
	{
		ses=time.getSession();
		t=ses.getTransaction();
	}
	public void recordOutTime(TimeInfo info) 
	{
		t.begin();
		ses.save(info);
		t.commit();
	}
	public TimeInfo getTimeInfo(int eid) 
	{
		Query<TimeInfo> q=ses.createQuery("from TimeInfo where eid=:p1 and intime=:p2");
		q.setParameter("p1",eid);
		q.setParameter("p2","Not in yet");
		TimeInfo info=q.uniqueResult();
		return info;
	}
	public void recordInTime(TimeInfo info, String intime, String totaltime) 
	{
		t.begin();
		info.setIntime(intime);
		info.setTotaltime(totaltime);
		t.commit();
	}
}
