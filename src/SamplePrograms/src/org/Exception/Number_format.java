package SamplePrograms.src.org.Exception;

public class Number_format {
	public static void main(String[] args) {
		
		String s1 = "123Welcome";
		
		System.out.println("String Value : "+s1);
		
		int i = Integer.parseInt(s1); // ---------> integer is converts to alphabet
		System.out.println("Integer Value : "+i);
	}

}
