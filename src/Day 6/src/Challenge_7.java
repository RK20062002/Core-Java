import java.util.*;
public class Challenge_7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Name :");
		String name = s.nextLine();
		
		System.out.println("Enter Phone No : ");
		long phno = s.nextLong();
		
		System.out.println("Enter Another No : ");
		long phone = s.nextLong();
		
		
		if (phno<10 || phno>10) {
			System.out.println(phno+" Invalid");
		}
		else {
			System.out.println(phno+" Valid");
		}
		
		if (phone<10 && phone>10) {
			System.out.println(phone+" Invalid");
		}
		else {
			System.out.println(phone+" Valid");
		}
	}
	
}
