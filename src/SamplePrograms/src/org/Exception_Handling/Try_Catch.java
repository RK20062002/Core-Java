package SamplePrograms.src.org.Exception_Handling;
/*
 * Try :-
 * 		Code which is expected to throw exception will be kept inside try block
 * 
 * Catch :-
 * 		Code block acts as a solution block, it will handle the exception
 * 
 *  Finally :-
 * 
 * 		Whether Exception occurs or not handled or not, finally block will always executed
 */

public class Try_Catch {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0); // Arithmetic Exception
		} 
		catch (Exception e) {  // Exception is Parent class
			System.out.println("Anything divided by zero is infinity");
		}
		
		System.out.println(4);
		System.out.println(6);
		
	}

}
