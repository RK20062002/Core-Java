package SamplePrograms.src.org.Array;

import java.util.Iterator;

/*
 * Array is a Collection of similar data types
 * Index based one
 * Array is fixed in size
 * Syntax:-
 * 		data_type [] variable = new data_type [value];
 * 
 * 		int [] mark = new int [500];
 */
public class Array {
	
	public static void main(String[] args) {
		
		int tamil[] = new int[4];
		
		tamil[0] = 89;
		tamil[2] = 90;
		tamil[1] = 99;
		tamil[3] = 90;
		
		
		System.out.println(tamil[2]+"\n");
		
		for (int i = 0; i < tamil.length; i++) {
			System.out.println("Normal For Loop : "+tamil[i]);
		}
		
		System.out.println("\n");
		
		for (int i : tamil) {
			System.out.println("Enhanced For Loop : "+i);
		}
	}
	

}
