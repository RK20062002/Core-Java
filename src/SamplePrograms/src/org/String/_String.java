package SamplePrograms.src.org.String;

public class _String{
	public static void main(String[] args) {
		String s = "Ranjith KUMAR";
		
		// To find particular character by using index
		
		char c = s.charAt(0);
		System.out.println(c);
		
		//convert uppercase
		
		String up = s.toUpperCase();
		System.out.println(up);
		
		// covert lowercase
		
		String lc = s.toLowerCase();
		System.out.println(lc);
		
		// to check string is empty or not
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		// to check whether the string starts with the particular value or not
		
		boolean startsWith = s.startsWith("Ran");
		System.out.println(startsWith);
		
		// to check whether the string ends with the particular value or not
		
		boolean endsWith = s.endsWith("Ith");
		System.out.println(endsWith);
		
		// to check whether the string contain the particular value or not
		
		boolean contains = s.contains("jit");
		System.out.println(contains);
		
		// to check the length of the string
		
		int length = s.length();
		System.out.println(length);
		
		// to change a particular character from the string
		
		String replace = s.replace("h", "H");
		System.out.println(replace);
		
		//to replace one word
		
		String replace2 = s.replace("KUMAR", "Kumar");
		System.out.println(replace2);
		
		//to replace all the occurence of word or character
		
		String replaceAll = s.replaceAll(s, "RANJITH KUMAR (RK)");
		System.out.println(replaceAll);

		// to find the index of a particular word
		
		int index = s.indexOf("R");
		System.out.println(index);
		
		int lastIndex = s.lastIndexOf("R");
		System.out.println(lastIndex);
		
		// to remove space before and after string
		
		String e = "     R A N J I T      ";
		String trim = e.trim();
		System.out.println(trim);
		
		// to remove space between the letters
		
		String replace3 = e.replace(" ", "");
		System.out.println(replace3);
		
		// to Starts with and ends with particular index
		
		String substring = s.substring(1, 12);
		System.out.println(substring);
		
		// to compare between 2 strings
		
		String s1 = "Ranjith";
		String s2 = "Kumar";
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		// to join 2 strings
		
		String concat = s1.concat(s2);
		System.out.println(concat);
	}
	
}
