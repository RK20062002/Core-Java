package SamplePrograms.src.org.Exception_Handling;

public class Try_multipleCatch {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0); // Arithmetic Exception
		}
		catch (NumberFormatException e) {
			System.out.println("Index out of Bound");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Cannot convert alphabet to number");
		}
		
		catch (Exception e) {
			System.out.println("Super Class.....");
		}
		
		System.out.println(4);
		System.out.println(5);
	}
}
