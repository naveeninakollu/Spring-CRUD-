package com.naveen.SpringBootCRUD.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.SpringBootCRUD.bean.Employee;
import com.naveen.SpringBootCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
	public EmployeeRepository Emprepo;
	public List<Employee> getAll()
	{
		List<Employee> emps=new ArrayList<>();
		Emprepo.findAll().forEach(emps::add);
		return emps;
	}
	public void addEmp(Employee emp) {
		// TODO Auto-generated method stub
		Emprepo.save(emp);
		
	}
	
	public void updateEmp(String empID, Employee emp) {
		// TODO Auto-generated method stub
		Emprepo.save(emp);
		
	}
	public void deleteEmp(String id) {
		// TODO Auto-generated method stub
		Emprepo.deleteById(id);
		
	}
}
