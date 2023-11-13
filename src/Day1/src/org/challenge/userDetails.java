package Day1.src.org.challenge;
import java.util.Scanner;
public class userDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = s.nextLine();
		
		System.out.println("Enter Age : ");
		int age = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Phone No : ");
		String phone = s.nextLine();
		
		System.out.println("Enter Email : ");
		String email = s.nextLine();
		
		System.out.println("Enter Address : ");
		String address = s.nextLine();
		
		System.out.println("Enter Salary : ");
		double salary = s.nextDouble();
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Phone No : "+phone);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);
	}

}
