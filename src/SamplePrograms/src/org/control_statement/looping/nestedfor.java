package SamplePrograms.src.org.control_statement.looping;

public class nestedfor {
	
	public static void main(String[] args) {
		for (int i = 0; i <2; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.println(j);
			}
			System.out.println(i);
		}
		
		/*		loop 1        loop 1         	loop 2        loop2          loop 2               loop 2         loop 1               loop 1
		 * 
		 * 		  1				2				  3				4			5(logic)			6(inc/dec)		7(logic)			8(inc/dec)
		 * 
		 *       i=0		   0<2				 j=0		   0<3          print(0)			   0+1=1
		 * 										 j=1           1<3			print(1)			   1+1=2
		 * 										 j=2		   2<3  		print(2)			   2+1=3
		 * 										 j=3		   3<3			exit loop 				---			print(0)			   0+1=1
		 * 		 
		 * 		 i=1		   1<2				 j=0		   0<3          print(0)			   0+1=1
		 * 										 j=1           1<3			print(1)			   1+1=2
		 * 										 j=2		   2<3  		print(2)			   2+1=3
		 *										 j=3		   3<3			exit loop 				---			print(1)			   1+1=2
		 *
		 *		 i=2		   2<2			<---------------------------------- loop exit --------------------------------------------------->
		 * 
		 * 
		 * */
		
	}

}
