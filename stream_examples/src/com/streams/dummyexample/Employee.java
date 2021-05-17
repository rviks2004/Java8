package com.streams.dummyexample;

public class Employee {
	
	private String eid;
	private String empName;
	private int salary;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	public Employee(String eid, String empName, int salary) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.salary = salary;
	}
	
	

}
