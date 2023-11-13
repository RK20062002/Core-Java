package SamplePrograms.src.org.Exception;

public class Null_Pointer {
	public static void main(String[] args) {
		
		// 2. Null Pointer Exception
		
		System.out.println("Welcome");
		String s = null;
		
		char c = s.charAt(3); // ---------> string is null so exception
		System.out.println(c);
		
		System.out.println("Thank You!!!");
	}
}
