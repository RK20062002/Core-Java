package SamplePrograms.src.org.control_statement.conditional;
import java.util.*;

public class nestif {
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = n.nextInt();
		
		if( num >=0) { //condition 1 
			System.out.println("Condition 1 is True");
			if(num >0) { //condition 2
				System.out.println("Condition 2 is True");
				System.out.println("The Number is Positive");
			}
			else {
				System.out.println("Condition 2 is False so print Condition 2 else part");
				System.out.println("The Number is Zero");
			}
			
		}
		else {
			System.out.println("Condition 1 is False so print Condition 1 else part");
			System.out.println("The Number is Negative");
		}
	}
	

}
