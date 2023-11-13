
public class Challenge3 {
	
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int data = 5/0;  // -----------> Exception line
		} 
		catch (ArithmeticException e) {
			System.out.println("2");
			System.exit(0);
		}
		finally {
			System.out.println("3");
			
		}
		System.out.println("4");
	}

}
