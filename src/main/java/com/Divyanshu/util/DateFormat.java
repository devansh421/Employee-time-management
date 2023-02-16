package com.Divyanshu.util;

import java.time.LocalDate;
import java.util.List;

import com.Divyanshu.models.TimeInfo;

public class DateFormat 
{
	public static String changeFormat(String date)
	{
		String[] x=date.split("-");
		return x[2]+"-"+x[1]+"-"+x[0];
	}
}
