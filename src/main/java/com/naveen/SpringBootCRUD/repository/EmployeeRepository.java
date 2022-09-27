package com.naveen.SpringBootCRUD.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naveen.SpringBootCRUD.bean.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String> {

	
	
}
