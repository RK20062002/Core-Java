import java.util.Set;
import java.util.TreeSet;

public class Challenge15 {
	
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
		
		Set<Integer> s2 = new TreeSet<Integer>();
		
		s2.add(100);
		s2.add(200);
		s2.add(300);
		s2.add(400);
		s2.add(500);
		s2.add(600);
		s2.add(700);
		s2.add(800);
		
		System.out.println("Set 1 : "+s);
		System.out.println("Set 2 : "+s2);
		
		s.retainAll(s2);
		
		System.out.println("Common Values : "+s);
	}
	
	

}
