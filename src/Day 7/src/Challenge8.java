import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Challenge8 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);
		l.add(605);
		l.add(705);
		l.add(805);
		l.add(505);
		l.add(605);
		
		System.out.println("List : "+l);
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		
		s.addAll(l);
		
		System.out.println("Set : "+s);
	}

}
