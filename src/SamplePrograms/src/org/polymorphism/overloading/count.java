package SamplePrograms.src.org.polymorphism.overloading;

//2) Based on Data Type Count

public class count {
	
	
		private void cusDetails(String name) {
			System.out.println("Customer Name : "+name);

		}
		
		private void cusDetails(int age , String address) {
			System.out.println("Customer Age : "+age);
			System.out.println("Customer Address : "+address);
			

		}

		private void cusDetails(float salary , long pfNo) {
			System.out.println("Customer Salary : "+salary);
			System.out.println("Customer PF No : "+pfNo);

		}
		public static void main(String[] args) {
			count c = new count();
			c.cusDetails("Ranjith");
			c.cusDetails(21, "Trichy");
			c.cusDetails(25000f, 3456654378l);
		}

}
