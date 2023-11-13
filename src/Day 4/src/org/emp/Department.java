package org.emp;

public class Department extends Employee {
	
	@Override
	void employeeDesignation() {
		System.out.println("Employee Designation : Junior Software Tester");
		
	}
	
	@Override
	public void employeeName() {
		System.out.println("Employee Name : Raju");
		
	}
	
	private void departmentName() {
		System.out.println("Department Name : Software Testing");

	}
	
	public static void main(String[] args) {
		Department d = new Department();
		d.employeeDesignation();
		d.employeeName();
		d.departmentName();
	}
	

}
