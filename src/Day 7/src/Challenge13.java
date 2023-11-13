import java.util.HashSet;
import java.util.Set;

public class Challenge13 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(90);
		s.add(10);
		s.add(10);
		s.add(40);
		s.add(50);
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(80);
		
		System.out.println("Set 1 : "+s);
		System.out.println("Set 2 : "+s2);
		
		s.retainAll(s2);
		
		System.out.println("Common Values : "+s);
	}

}
