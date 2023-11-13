package SamplePrograms.src.org.Constructor;

public class Parameterized {
	
	// 1. Non-Parameterized Constructor
	
		public Parameterized() {
			System.out.println("Employee Salary : 250000");
		}
		
	// 2. Parameterized Constructor
		
		public Parameterized(int id) {
			System.out.println("Employee Id : "+id);
		}
		
		public Parameterized(int age, String name, Long ph) {
			System.out.println("Employee Age : "+age);
			System.out.println("Employee Name : "+name);
			System.out.println("Employee Phone No : "+ph);
		}
		
		public static void main(String[] args) {
			Parameterized p = new Parameterized();
			Parameterized p1 = new Parameterized(4345);
			Parameterized p2 = new Parameterized(22, "RK", 9715435855l);
		}
}
