package com.Divyanshu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Divyanshu.models.Employee;
import com.Divyanshu.services.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired private EmployeeService service;
	
	@RequestMapping("employee/add")
	public String getInsertView()
	{
		return "employee/insert";
	}
	@RequestMapping("employee/save-record")
	public String saveEmployeeRecord(Employee emp,Model model)
	{
		int eid=emp.getEid();
		Employee employee=service.getEmployee(eid);
		if(employee!=null)
		{
			model.addAttribute("msg","Employee with id "+eid+" already exists");
			return "employee/insert";
		}
		service.saveRecord(emp);
		return "employee/save";
	}
}
