package com.naveen.SpringBootCRUD.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.SpringBootCRUD.bean.Employee;
import com.naveen.SpringBootCRUD.service.EmployeeService;


@RestController
public class APIController {
	
	@Autowired
	private EmployeeService empservice;
	
	@RequestMapping("/Employees")
	public List<Employee> getAll()
	{
		return empservice.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Employees")
	public void addEmp(@RequestBody Employee emp)
	{
		System.out.println("Employee details added successfully");
		empservice.addEmp(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Employees/{id}")
	public void updateEmp(@PathVariable String id,@RequestBody Employee emp)
	{
		System.out.println("Employee details with empID:" +id+ "updated successfully");
		empservice.updateEmp(id,emp);
	}
	
	public void deleteEmp(String id)
	{
		empservice.deleteEmp(id);
	}

	
}


