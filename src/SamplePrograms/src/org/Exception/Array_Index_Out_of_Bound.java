package SamplePrograms.src.org.Exception;

public class Array_Index_Out_of_Bound {
	
	public static void main(String[] args) {
		
		// 3. Array Index out of bound Exception
		
		int a[] = new int[3];
		
		a[0] = 250;
		a[1] = 370;
		a[2] = 420;
		a[3] = 500; // --------> out of array
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
