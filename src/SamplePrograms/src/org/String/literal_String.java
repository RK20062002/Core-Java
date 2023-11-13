package SamplePrograms.src.org.String;	

/*
 *Types :-
 *	Literal String 
 * 	Non-Literal String
 * 	Immutable String
 * 	Mutable String
 * 
 * Find Memory Space Syntax :-
 * 	
 * 		System.identityHashCode()
 * 
 * Literal String is Store inside of the String pool Constant
 * 
 * Duplicate value is also store the same location. 
 * 
 */

public class literal_String {
	public static void main(String[] args) {
		
		System.out.println("Literal String :-");
		
		String s1 = "Ranjith";
		String s2 = "Kumar";
		
		System.out.println("S1 : "+System.identityHashCode(s1));  //Syntax<----------System.identityHashCode() 
		System.out.println("S2 : "+System.identityHashCode(s2));
		
		String s3 = "Kumar";
		
		System.out.println("S3 : "+System.identityHashCode(s3));
				
	}

}
