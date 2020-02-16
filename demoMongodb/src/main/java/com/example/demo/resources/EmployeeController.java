package com.example.demo.resources;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController

public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee employee ){
		repository.save(employee);
		return "Added book with id : "+ employee.getid();
	}
	
	@GetMapping("/findAllEmployee")
	 public List getEmployee1(@PathVariable int id){
		 return repository.findAll();
		 
	}

	@GetMapping("/findAllEmployee/{id}")
	 public Optional<Employee> getEmployee(@PathVariable int id){
		return repository.findById(id);
	}
	@GetMapping("/delete/{id}")
	public String deleteEmployee (@PathVariable int id ){
		repository.deleteById(id);
		return "delete with id :"+id;
	}
		
	
		 
	}

