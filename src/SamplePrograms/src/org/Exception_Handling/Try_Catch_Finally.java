package SamplePrograms.src.org.Exception_Handling;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0); // Arithmetic Exception
		}
		
		catch (Exception e) {  // Exception is Parent class
			System.out.println("Anything divided by zero is infinity");
		}
		
		finally {
			System.out.println("Finally....");
		}
		
		System.out.println(4);
		System.out.println(6);
		
	}

}
