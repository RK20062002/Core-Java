import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Challenge11 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<Integer>();
		
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
		
		Iterator<Integer> i = s.iterator();
		
		System.out.println("Tree Set : "+s);
		
		
		
		while (i.hasNext()) {
			System.out.println("Iterate Value : "+i.next());
				
		}
		
		
	}

}
