package com.Divyanshu.util;

import java.time.LocalTime;

public class TimeCalculator 
{
	public static String getTime()
	{
		LocalTime lt=LocalTime.now();
		String time=lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond();
		return time;
	}
	public static String getTotalTime(String intime, String outtime) 
	{
		String[] x=intime.split(":");
		String[] y=outtime.split(":");
		int total=getTotalTimeInSeconds(x,y);
		return total/60+" min "+total%60+" sec";
	}
	private static int getTotalTimeInSeconds(String[] x,String[] y)
	{
		int intime=Integer.parseInt(x[0])*3600+Integer.parseInt(x[1])*60+Integer.parseInt(x[2]);
		int outtime=Integer.parseInt(y[0])*3600+Integer.parseInt(y[1])*60+Integer.parseInt(y[2]);
		int totaltime=intime-outtime;
		return totaltime;
	}
}
