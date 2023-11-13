import java.util.Scanner;

public class Challenge_14 {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Name1 :");
		String name1 = s.nextLine();
		
		System.out.println("Enter Name2 : ");
		String name2 = s.nextLine();
		
		System.out.println("Name 1 :"+System.identityHashCode(name1));
		System.out.println("Name 2 :"+System.identityHashCode(name2));
	}
}
