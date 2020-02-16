package com.example.demo.Services;
import java.util.List;

import java.util.Optional;

public interface EmployeeServices {
	


		List<EmployeeServices> getAllEmployee();

		

		Optional <EmployeeServices> getEmployeeById(String Emp_id);

		EmployeeServices addNewCompany(EmployeeServices Emp);

		 

		boolean IsEmployeeIsExsists(String s);

	}