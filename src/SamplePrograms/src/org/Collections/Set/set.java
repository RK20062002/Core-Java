package SamplePrograms.src.org.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// value based one
// not allow duplicate

/*Types :-
 * 		HashSet         -- Random order  -- 1 null only   -- Set s = new HashSet();
 * 		LinkedHashSet   -- Insertion order -- 1 null only -- Set s = new LinkedSet();
 * 		TreeSet         -- Ascending order -- no null     -- Set s = new TreeSet();
 * 
 * 		10 methods 
 */

public class set {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> s2 = new TreeSet<Integer>();
		
		s.add(90);
		s.add(80);
		s.add(50);
		s.add(80);
		s.add(null);
		s.add(40);
		
		s2.add(20);
		s2.add(60);
		s2.add(30);
		s2.add(20);
		s2.add(60);
		s2.add(40);
		
		System.out.println(s);
		System.out.println(s2);
		
		// 2. remove value from the set
		
		s.remove(90);
		System.out.println("Set 1 Remove 90 : "+s);
		
		// 3. to compare 2 sets
		
		boolean equals = s.equals(s2);
		System.out.println(equals);
		
		
	}

}
