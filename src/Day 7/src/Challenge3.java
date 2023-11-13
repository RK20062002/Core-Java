import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Challenge3 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(60);
		l.add(80);
		l.add(60);
		l.add(50);
		
		System.out.println(l);
		
		Set<Integer> s = new LinkedHashSet<>();
		
		s.addAll(l);
		
		System.out.println("After Remove duplicates : "+s);
		
		
		
		
		
		
	}

}
