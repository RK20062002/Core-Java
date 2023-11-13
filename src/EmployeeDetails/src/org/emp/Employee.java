package EmployeeDetails.src.org.emp;

public class Employee {
	private void empId() {
		System.out.println("2201");

	}
	private void empName() {
		System.out.println("Ranjith");

	}
	private void empDOB() {
		System.out.println("20Th June 2002");

	}
	private void empPhone() {
		System.out.println("9715435855");

	}
	private void empEmail() {
		System.out.println("ranjithm114@gmail.com");

	}
	private void empAddress() {
		System.out.println("Trichy");

	}
	public static void main(String[] args) {
		/*Object Creation Syntax
		 * 
		 * ClassName object = new ClassName;
		 * 
		 * */
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDOB();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}

}
