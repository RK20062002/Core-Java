package SamplePrograms.src.org.abstraction.fully_abstraction;

//interface class we can use "extends" --> "implements"

public class StudentDetails implements Student {

	@Override
	public void studentName() {
		System.out.println("Student Name : Ranjith");
		
	}

	@Override
	public void studentBloodGroup() {
		System.out.println("Student Blood Group : O+ve");
		
	}
	
	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.studentName();
		s.studentBloodGroup();
	}
	
	

}
