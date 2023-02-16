package com.Divyanshu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.Employee;
import com.Divyanshu.services.EmployeeService;
import com.Divyanshu.services.TimeInfoService;

@Controller
public class InTimeController 
{
	@Autowired private TimeInfoService tservice;
	@Autowired private EmployeeService eservice;
	
	@RequestMapping("intime/namelist")
	public String getEmployeeNameList(Model model)
	{
		List<Employee> list=eservice.getEmployeeOutList();
		model.addAttribute("elist",list);
		return "intime/employee-out-name-list";
	}
	@RequestMapping("intime/save")
	public String recordEmployeeOuttime(int eid,Model model)
	{
		String name=tservice.saveIntime(eid);
		model.addAttribute("name",name+"("+eid+")");
		return "intime/intime-save-success";
	}
}
