package com.Divyanshu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.Employee;
import com.Divyanshu.models.TimeInfo;
import com.Divyanshu.services.EmployeeService;
import com.Divyanshu.services.TimeInfoService;

@Controller
public class OutTimeController 
{
	@Autowired private TimeInfoService tservice;
	@Autowired private EmployeeService eservice;
	
	@RequestMapping("outtime/namelist")
	public String getEmployeeNameList(Model model)
	{
		List<Employee> list=eservice.getEmployeeInList();
		model.addAttribute("elist",list);
		return "outtime/employee-in-name-list";
	}
	@RequestMapping("outtime/save")
	public String recordEmployeeOuttime(TimeInfo info,Model model)
	{
		String name=tservice.saveOuttime(info);
		model.addAttribute("name",name+"("+info.getEid()+")");
		return "outtime/outtime-save-success";
	}
}
