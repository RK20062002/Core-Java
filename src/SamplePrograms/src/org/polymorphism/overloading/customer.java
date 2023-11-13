package SamplePrograms.src.org.polymorphism.overloading;



public class customer {
	
	// =========== Based on Data Type ==================
	 
			 private void cusDetails(String name) {
		System.out.println("Customer Name : "+name);

	}
	
	private void cusDetails(int age) {
		System.out.println("Customer Age : "+age);
		

	}

	private void cusDetails(float salary) {
		System.out.println("Customer Salary : "+salary);

	}
	public static void main(String[] args) {
		customer c = new customer();
		c.cusDetails("Ranjith");
		c.cusDetails(21);
		c.cusDetails(25000f);
	}
	
	

}
