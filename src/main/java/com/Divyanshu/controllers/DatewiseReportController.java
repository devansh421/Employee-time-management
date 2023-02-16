package com.Divyanshu.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.TimeInfo;
import com.Divyanshu.services.ReportService;
import com.Divyanshu.util.DateFormat;

@Controller
public class DatewiseReportController 
{
	@Autowired private ReportService service;
	
	@RequestMapping("datewise-report")
	public String getDateOptionView(Model model)
	{
		model.addAttribute("dt",LocalDate.now());
		return "datewise-report/choose-date";
	}
	@RequestMapping("datewise-report/current-date")
	public String getCurrentDateList(Model model)
	{
		List<TimeInfo> list=service.getDatewiseCurrentDateList();
		model.addAttribute("tlist",list);
		model.addAttribute("date",DateFormat.changeFormat(LocalDate.now().toString()));
		return "datewise-report/current-date";
	}
	@RequestMapping("datewise-report/any-date")
	public String getAnyDateList(Model model,String date)
	{
		LocalDate dt=LocalDate.parse(date);
		List<TimeInfo> list=service.getDatewiseAnyDateList(dt);
		model.addAttribute("tlist",list);
		model.addAttribute("date",DateFormat.changeFormat(date));
		return "datewise-report/any-date";
	}
}
