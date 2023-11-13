import java.util.HashSet;
import java.util.Set;

public class Challenge4 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		
		System.out.println("HashSet : "+s);
	}

}
