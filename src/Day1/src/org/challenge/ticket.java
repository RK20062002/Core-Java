package Day1.src.org.challenge;

import java.util.*;

public class ticket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter From Station :");
		String from = s.nextLine();
		
		System.out.println("Enter To Station :");
		String to = s.nextLine();
		
		System.out.println("Enter Ticket Price :");
		int ticket = s.nextInt();
		
		System.out.println("Enter Food Price :");
		int food = s.nextInt();
		
		System.out.println("Enter Travel Cost :");
		int travelCost = s.nextInt();
		
		System.out.println("Enter Hotel Rent :");
		int hotelRent = s.nextInt();
		
		System.out.println("From : "+from);
		System.out.println("To : "+to);
		System.out.println("Ticket Price : "+ticket);
		System.out.println("Food Price : "+food);
		System.out.println("Travel Cost : "+travelCost);
		System.out.println("Hotel Rent : "+hotelRent);
		
	}

}
