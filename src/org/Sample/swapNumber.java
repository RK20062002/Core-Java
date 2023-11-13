package org.Sample;

import java.util.Scanner;

public class swapNumber {
public static void main(String[] args) {
	int x,y,temp;
	System.out.println("Enter x and y Number : ");
	Scanner s = new Scanner(System.in);
	x = s.nextInt();
	y = s.nextInt();
	System.out.println("Before Swap : "+x+" ,"+y);
	temp = x;
	x = y;
	y = temp;
	System.out.println("After Swap : "+ x +" ,"+ y);
	
	// Without 3rd variable
	/*
	 * x = x+y;
	 * y = x-y;
	 * x = x-y;
	 */
	
}
}
