package SamplePrograms.src.org.Collections.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {
	
	public static void main(String[] args) {
		
		java.util.Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		
		// 1. add
		
		m.put(99, "Tamil");
		m.put(80, "English");
		m.put(99, "Maths");
		m.put(80, "Physics");
		m.put(89, "Chemistry");
		m.put(99, "Biology");
		
		System.out.println(m);  // same keys are store new values
		
		// 2. size
		
		int size = m.size();
		System.out.println("Map Size : "+size);
		
		// 3. to get value particular value
		
		String get = m.get(99);
		System.out.println("Get Value : "+get);
		
		// 4. to remove particular value
		
		String remove = m.remove(80);
		System.out.println("After Remove : "+remove);
		
		// 5. to check key is present or not
		
		boolean containsKey = m.containsKey(89);
		System.out.println("Key is contain or not : "+containsKey);
		
		// 6. to check value is present or not
		
		boolean c = m.containsValue("Physics");
		System.out.println("Value is contain or not : "+c);
		
		// 7. to display key only
		
		Set<Integer> keys = m.keySet();
		System.out.println("Keys Only : "+keys);
		
		// 8. to display value only
		
		Collection<String> values = m.values();
		System.out.println("Values Only : "+values);
		
		// 9. to iterate the map
		
		Set<Entry<Integer, String>> iterate = m.entrySet();
		System.out.println("Iterate map into Set : "+iterate);
		
		// 10. to display the corresponding keys only
		
		for (Entry<Integer, String> e : iterate) {
			
			Integer key = e.getKey();
			System.out.println("Inhanced for (corresponding keys) : "+key);
		
		// 11. to display the corresponding value
			
			String value = e.getValue();
			System.out.println("Inhanced for (corresponding keys) : "+value);
		}
		
		
		// 12. to clear all values
		
		m.clear();
		System.out.println("After Clear : "+m);
		
		// 13. to check empty or not
		
		boolean empty = m.isEmpty(); 
		System.out.println("Is empty or not : "+empty);
		
		 
	}

}
