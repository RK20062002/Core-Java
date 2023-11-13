import java.util.Scanner;

public class Challenge_13 {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Name1 :");
	String name1 = s.nextLine();
	
	System.out.println("Enter Name2 : ");
	String name2 = s.nextLine();
	
	boolean equals = name1.equals(name2);
	System.out.println(equals);
	
	}

}
