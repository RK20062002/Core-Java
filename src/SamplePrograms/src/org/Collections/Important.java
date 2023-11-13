package SamplePrograms.src.org.Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Important {
	
	public static void main(String[] args) {
		
		List<Integer> i = new Vector<Integer>();
		
		
		i.add(10);
		i.add(90);
		i.add(50);
		i.add(30);
		i.add(50);
		i.add(70);
		i.add(40);
		i.add(50);
		
		System.out.println(i);
		
		// to remove duplicate from the collection
		
		Set<Integer> s = new HashSet<Integer>();
		
		s.addAll(i);
		System.out.println(s);
	}

}
