import java.util.*;

public class Challenge_4 {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter Your Email : ");
		String email = n.nextLine();
		
		boolean contains = email.contains("@");
		if ( contains == true) {
			
			System.out.println("Valid email id");
			
		}
		else {
			System.out.println("Invalid email id");
		}
	}

}
