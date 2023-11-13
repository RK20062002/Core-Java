package org.det;

public class InternsDetails {
	private void interns(String name) {
		System.out.println("Enter Course Name : "+name);

	}
	
	private void interns(int duration) {
		System.out.println("Enter Duration (Months) : "+duration);

	}
	
	private void interns(float fee) {
		System.out.println("Enter Fee : "+fee);

	}
	public static void main(String[] args) {
		InternsDetails i = new InternsDetails();
		i.interns("Software Testing");
		i.interns(3);
		i.interns(10000f);
		
	}

}
