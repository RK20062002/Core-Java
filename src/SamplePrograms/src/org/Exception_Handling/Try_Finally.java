package SamplePrograms.src.org.Exception_Handling;

public class Try_Finally {
	public static void main(String[] args) {
		
		String s = "java";
		try {
			char charAt = s.charAt(5);   // ----------> Exception line
			
		} finally {
			System.out.println("Finally.....");  // -----------> exception occur or not but finally block is always executed. 
			
		}
		
		
	}

}
