package SamplePrograms.src.org.Exception;

public class String_Index_out_of_Bound {
	
	public static void main(String[] args) {
		
		String s = "Java";
		// j=0; a=1; v=2; a=3
		
		char c = s.charAt(5); // --------> index is out of range
		System.out.println(c);
	}

}
