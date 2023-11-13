package SamplePrograms.src.org.Constructor;

/*Constructor :-
 * 		It is a Special method that is used to initialize objects automatically.
 *
 *Rule :-
 *		ClassName and Constructor name should be same
 *		Constructor should not have a return type
 *
 *Types :-
 *		Non-Parameterized
 *		Parameterized
 */

public class constructor {
	private void employeeID() {
		System.out.println("Employee ID : 5356");

	}
	
	// 1. Non-Parameterized Constructor
	
	public constructor() {
		System.out.println("Employee Salary : 250000");
	}
	
	public static void main(String[] args) {
		constructor c = new constructor();  // --> Interview Qus : when constructor is invoke? 
		c.employeeID();						// ----------- > Ans : after the "new" keyword
	}
}
