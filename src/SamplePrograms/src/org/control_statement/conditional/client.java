package SamplePrograms.src.org.control_statement.conditional;

// if and if else conditions

public class client {
	public static void main(String[] args) {
		int id1 = 21, id2 = 42;
		if (id2 >= 40 && id1 != 20) { //logic 1 AND Operator
			
			System.out.println("AND Codition True");
		}
		//else
		else { //logic 2
			
			System.out.println("AND Coditin False");
		}
		
		if(id2 == 40 || id1 ==20) {//logic 1 OR Operator
			
			System.out.println("OR Condition True");
		}
		//else
		else { //logic 2
			
			System.out.println("OR Condition False");
		}
		
	}
	
	

}
