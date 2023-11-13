package SamplePrograms.src.org.String;

//Non-Literal String is store values in heap memory location

//Duplicate value is allocate different location

public class Non_literal {
	
	public static void main(String[] args) {
		
		System.out.println("Non-Literal String");
		
		String s1 = new String("Java");
		String s2 = new String("Python");
		
		System.out.println("S1 : "+System.identityHashCode(s1));
		System.out.println("S2 : "+System.identityHashCode(s2));
		
		String s3 = new String("Java");
		
		System.out.println("S3 : "+System.identityHashCode(s3));  //  <---- Duplicate value Store different location
	}

}
