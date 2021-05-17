package com.streams.dummyexample;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeSalaryService {
	
	public List<Employee> evaluateTaxSlab(String input){
		
	return (input.equalsIgnoreCase("tax"))
			?DummyDao.getEmployeeList().stream().filter(e -> e.getSalary()>10000).collect(Collectors.toList())	
			:DummyDao.getEmployeeList().stream().filter(e -> e.getSalary()<10000).collect(Collectors.toList());		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new EmployeeSalaryService().evaluateTaxSlab("ntax"));

	}

}
