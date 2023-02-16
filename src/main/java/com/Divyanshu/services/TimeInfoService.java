package com.Divyanshu.services;

import com.Divyanshu.models.TimeInfo;

public interface TimeInfoService 
{
	String saveOuttime(TimeInfo info);
	String saveIntime(int eid);
}
