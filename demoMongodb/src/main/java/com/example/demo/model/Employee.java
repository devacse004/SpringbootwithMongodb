package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Employee")

public class Employee {
    @Id
	private int Emp_id;
    private String Emp_name;
    private int salary;
	public String getEmpname() {
		return Emp_name;
	}
	public void setEmpname(String empname) {
		Emp_name = empname;
	}
	public int getid() {
		return Emp_id;
	}
	public void setEmpname(int id) {
		Emp_id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
