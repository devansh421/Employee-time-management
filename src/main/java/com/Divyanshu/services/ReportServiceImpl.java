package com.Divyanshu.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Divyanshu.models.TimeInfo;
import com.Divyanshu.repositories.ReportRepository;
import com.Divyanshu.services.ReportService;

@Service
public class ReportServiceImpl implements ReportService 
{
	@Autowired private ReportRepository repo;
	
	public List<TimeInfo> getDatewiseCurrentDateList() 
	{
		return repo.getDatewiseCADateList(LocalDate.now());
	}
	public List<TimeInfo> getDatewiseAnyDateList(LocalDate date) 
	{
		return repo.getDatewiseCADateList(date);
	}
}
