package com.streams.dummyexample;

import java.util.ArrayList;
import java.util.List;

public class DummyDao {
	
	public static List<Employee> getEmployeeList(){
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("111", "Rahul", 10000));
		empList.add(new Employee("222", "Vikas", 30000));
		empList.add(new Employee("333", "Suraj", 9000));
		empList.add(new Employee("444", "Renu", 4000));
		return empList;
		
	}

}
