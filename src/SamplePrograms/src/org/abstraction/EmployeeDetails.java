package SamplePrograms.src.org.abstraction;

public class EmployeeDetails extends Employee {
	
	@Override
	void employeeAddress() {
		System.out.println("Employee Address : Trichy");
		
	}
	
	@Override
	public void employeeId() {
		System.out.println("Employee ID : 2523");
	}
	
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.employeeAddress();
		e.employeeId();
	}

}
