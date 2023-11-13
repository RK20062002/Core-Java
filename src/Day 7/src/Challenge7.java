import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Challenge7 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println("List : "+l);
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		s.addAll(l);
		
		System.out.println("Set : "+s);
	}

}
