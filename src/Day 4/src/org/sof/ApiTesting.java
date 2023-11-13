package org.sof;

public class ApiTesting implements Manual {
	
	@Override
	public void Framework() {
		System.out.println("This is Framework method");
		
	}
	
	@Override
	public void TestCase() {
		System.out.println("This is Test Case method");
		
	}
	
	private void RestAssured() {
		System.out.println("This is Rest Assured method");

	}
	
	public static void main(String[] args) {
		ApiTesting a = new ApiTesting();
		a.Framework();
		a.TestCase();
		a.RestAssured();
	}

}
