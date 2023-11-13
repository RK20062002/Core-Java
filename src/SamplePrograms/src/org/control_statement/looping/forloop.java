package SamplePrograms.src.org.control_statement.looping;

public class forloop {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
			// step 1            step 2            step 3         step 4
			//
			//  i=0               0<5              print(0)        0+1=1
			//  i=1               1<5              print(1)        1+1=2
			//  i=2               2<5              print(2)        2+1=3
			//  i=3               3<5              print(3)        3+1=4
			//  i=4               4<5              print(4)        4+1=5
			//  i=5               5<5             exit loop         ---
			
		}
		System.out.println("Loop is Stoped Because i value is 5");
	}

}
