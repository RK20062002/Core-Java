package SamplePrograms.src.org.String;

// We create Object

public class Mutable {
	
	public static void main(String[] args) {
		
		System.out.println("Mutable String");
		
		StringBuffer s1 = new StringBuffer("Software Testing");
		StringBuffer s2 = new StringBuffer("Class");
		
		System.out.println("S1 : "+System.identityHashCode(s1));
		System.out.println("S2 : "+System.identityHashCode(s2));
		
		s1 = s1.append(s2);
		
		System.out.println(s1);
		
		System.out.println("S1 : "+System.identityHashCode(s1));
	}

}
