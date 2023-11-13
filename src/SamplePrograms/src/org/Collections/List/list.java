package SamplePrograms.src.org.Collections.List;

import java.util.LinkedList;
import java.util.List;

public class list {
	
	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<>();  //generic symbol--> " <..> "
		
		// 1. add values 
		
		l.add(10); // 0
		l.add(20); // 1
		l.add(30); // 2
		l.add(40); // 3
		l.add(40); // 4
		l.add(30); // 5
		l.add(50); // 6
		l.add(60); // 7
		l.add(10); // 8
		l.add(10); // 9
		
		System.out.println(l);
		
		// Other Methods:-
		
		// 2. to find a size of the list
		
		int size = l.size();
		System.out.println("\n Size : "+size);

		// 3. to get particular value from list by passing index
		
		Integer i = l.get(7);
		System.out.println("\n Value : "+i);
		
		// 4. to add a value at particular index position
		
		l.add(9, 90);
		System.out.println("Last updated List : "+l);
		
		// 5. to replace value at particular index position
		
		l.set(8, 80);
		System.out.println(l);
		
		// 6. to remove value at particular index position
		
		l.remove(10);
		System.out.println("After Remove value : "+l);
		
		// 7. to check whether the value is present or not
		
		boolean contains = l.contains(50);
		System.out.println("Check value present or not : "+contains);
		
		// 8. to check whether the value is empty or not
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		// 9. to find index position of particular value (first)
		
		int first = l.indexOf(10);
		System.out.println("First Occurance (10) : "+ first);
		
		// 10. to find index position of particular value (last)
		
		int last = l.lastIndexOf(30);
		System.out.println("Last Occurance (30) : "+ last);
		
		// 11. to copy and paste elements from one list to another list
			
		// Create 2 new lists
		
		List<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(30);
		
		list2.addAll(list1);
		System.out.println(list2);
		
		// 12. to get common value from the list
		
		list2.retainAll(list1);
		System.out.println("Common Values (list1 & list2 ) :"+list2);
		
		// 13. to remove common values from both list
		
		list2.removeAll(list1);
		System.out.println("After Remove Common Values : "+list2);
		
		// 14.  to delete all the elements in list
		
		l.clear();
		System.out.println("Remove All values from the first List : "+l);
		
	}

}
