package com.Divyanshu.repositories;

import java.time.LocalDate;
import java.util.List;

import com.Divyanshu.models.TimeInfo;

public interface ReportRepository 
{
	List<TimeInfo> getDatewiseCADateList(LocalDate date);
}
