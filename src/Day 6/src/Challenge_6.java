import java.util.Scanner;

public class Challenge_6 {
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter Company Name : ");
		String complex = s.nextLine();
		
		System.out.println("Enter Complex : ");
		String area = s.nextLine();
		
		System.out.println("Enter District : ");
		String dist = s.nextLine();
		
		System.out.println("Enter Phone No : ");
		String phone = s.nextLine();
		boolean empty = phone.isEmpty();
		
		if (empty) {
			System.out.println("Invalid Address");
		}
		
			
	}

}
