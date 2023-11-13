package SamplePrograms.src.org.control_statement.jump;

public class system_exit {
	
	// Used to Terminate whole Program
	
public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			
			if (i==5) {
				
				System.exit(i);
			}
			System.out.println(i);
			
		}
		
		System.out.println("End....");
	}

}
