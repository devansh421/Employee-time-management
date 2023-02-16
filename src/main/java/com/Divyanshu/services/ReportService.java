package com.Divyanshu.services;

import java.time.LocalDate;
import java.util.List;

import com.Divyanshu.models.TimeInfo;

public interface ReportService 
{
	List<TimeInfo> getDatewiseCurrentDateList();
	List<TimeInfo> getDatewiseAnyDateList(LocalDate date);
}
