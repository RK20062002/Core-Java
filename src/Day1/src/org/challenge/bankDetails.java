package Day1.src.org.challenge;

import java.util.Scanner;

public class bankDetails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Bank Name :");
		String b_name = s.nextLine();
		
		System.out.println("Enter Branch Name :");
		String br_name = s.nextLine();
		
		System.out.println("Enter Customer Name :");
		String c_name = s.nextLine();
		
		System.out.println("Enter Account NO:");
		int ac_no = s.nextInt();
		
		System.out.println("Enter Saving Balance :");
		int savingBalance = s.nextInt();
		
		System.out.println("Enter Loan Amount :");
		int loanAmount = s.nextInt();
		
		System.out.println("Bank Name : "+b_name);
		System.out.println("Branch Name: "+br_name);
		System.out.println("Customer Name : "+c_name);
		System.out.println("Account No : "+ac_no);
		System.out.println("Saving Balance : "+savingBalance);
		System.out.println("Loan Amount : "+loanAmount);
		
	}

}
