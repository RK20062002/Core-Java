package SamplePrograms.src.org.sample;

import java.util.*;
public class Scan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee Name :");
		String name = s.nextLine();
		
		System.out.println("Enter Employee ID :");
		int id = s.nextInt();
		
		System.out.println("Enter Employee Age :");
		int age = s.nextInt();
		
		System.out.println("Enter Employee Salary :");
		double salary = s.nextDouble();
		
		System.out.println("Enter Employee Rating (out of 5 ) :");
		float rating = s.nextFloat();
		
		System.out.println("Is the Employee is Manager ? (true/false) :");
		boolean isManager = s.nextBoolean();
		
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Rating :"+rating);
		System.out.println("Is Manager :"+isManager);
	}
	

}
