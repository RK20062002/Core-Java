package org.inm;

public class InternEducation extends InternDetail {
	private void ugDegree() {
		System.out.println("BCA");

	}
	
	private void ugPercentage() {
		System.out.println("76");

	}
	public static void main(String[] args) {
		InternEducation edu = new InternEducation();
		edu.internName();
		edu.registeredInternship();
		edu.intershipDuration();
		edu.ugDegree();
		edu.ugPercentage();
	}

}
