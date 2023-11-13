package SamplePrograms.src.org.String;

// memory cannot change

public class Immutable {
	
	public static void main(String[] args) {
		
		System.out.println("Mutable String");
		
		String s1 = "Python";
		String s2 = "Java";
		
		System.out.println("S1 : "+System.identityHashCode(s1));
		System.out.println("S2 : "+System.identityHashCode(s2));
		
		// Concat method
		
		s1 = s2.concat(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("S1 : "+System.identityHashCode(s1));
	}

}
