
public class Challenge1 {
	
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int sum = 9/0;  // -----------> Exception line
			System.out.println("2");
		} 
		catch (ArithmeticException e) {
			System.out.println("3");
		}
		catch (Exception e) {
			System.out.println("4");
		}
		finally {
			System.out.println("5");
		}
	}

}
