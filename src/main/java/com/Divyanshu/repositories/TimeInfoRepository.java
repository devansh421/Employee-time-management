package com.Divyanshu.repositories;

import java.time.LocalDate;

import com.Divyanshu.models.TimeInfo;

public interface TimeInfoRepository 
{
	void recordOutTime(TimeInfo info);
	TimeInfo getTimeInfo(int eid);
	void recordInTime(TimeInfo info, String intime, String totaltime);
}
