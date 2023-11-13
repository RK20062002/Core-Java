package org.Sample;

public class ReverseOrder {

	public static void main(String[] args) {
		String s1 = new String();
		s1 = "Hello";
		System.out.println("String is : "+s1);
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2 = s2.reverse();
		System.out.println("Reverse Order is : "+s2);
	}
}
