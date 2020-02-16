package com.example.demo.resources;

import java.awt.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeRepository {

	void deleteById(int id);

	List findAll();

	Optional<Employee> findById(int id);

	void save(Employee employee);

}
