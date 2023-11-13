package SamplePrograms.src.org.Collections.List;

import java.util.LinkedList;
import java.util.List;

// List is a index based
// List have 14 methods

public interface list_add {
	public static void main(String[] args) {
		
		//ClassName obj = new ClassName();
		List li = new LinkedList();
		
		li.add(10); // int
		li.add("Rk"); // String
		li.add(10); // int duplicate value -- Collections are stores similar values
		li.add(null); // null
		li.add(9876545678l); // long data type end we must put "l"
		li.add(10.5f); //float at end of the value put "f"
		li.add(false); // boolean
		li.add("@"); // char
		li.add(null); // null duplicate value
		li.add("Rk"); // String duplicate value
		
		System.out.println(li);
		
		
	}
	
}
