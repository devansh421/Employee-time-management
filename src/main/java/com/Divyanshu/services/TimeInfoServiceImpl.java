package com.Divyanshu.services;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.Employee;
import com.Divyanshu.models.TimeInfo;
import com.Divyanshu.repositories.EmployeeRepository;
import com.Divyanshu.repositories.TimeInfoRepository;
import com.Divyanshu.services.TimeInfoService;
import com.Divyanshu.util.TimeCalculator;

@Service
public class TimeInfoServiceImpl implements TimeInfoService 
{
	@Autowired private TimeInfoRepository repo;
	@Autowired private EmployeeRepository erepo;
	
	public String saveOuttime(TimeInfo info) 
	{
		info.setOuttime(TimeCalculator.getTime());
		info.setIntime("Not in yet");
		info.setTotaltime("Not applicable");
		info.setDate(LocalDate.now());
		repo.recordOutTime(info);
		Employee emp=erepo.getEmployeeRecord(info.getEid());
		erepo.updateOutStatus("out",emp);
		return emp.getName();
	}
	public String saveIntime(int eid) 
	{
		TimeInfo info=repo.getTimeInfo(eid);
		String intime=TimeCalculator.getTime();
		String outtime=info.getOuttime();
		String totaltime=TimeCalculator.getTotalTime(intime,outtime);
		repo.recordInTime(info,intime,totaltime);
		Employee emp=erepo.getEmployeeRecord(info.getEid());
		erepo.updateOutStatus("in",emp);
		return emp.getName();
	}
}
