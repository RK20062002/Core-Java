package SamplePrograms.src.org.polymorphism.overriding;

public class Arts extends Education {
	@Override
	public void ug(String dept) {
		System.out.println("Which Department : "+dept);
	}
	
	@Override
	public void pg(int stu) {
		System.out.println("Number of Students : "+stu);
	}
	
	private void bsc() {
		System.out.println("BCA");

	}
	
	private void bEd() {
		System.out.println("Education");

	}
	
	private void ba() {
		System.out.println("English");

	}
	
	private void bBa() {
		System.out.println("Management");

	}
	
	public static void main(String[] args) {
		Arts edu = new Arts();
		edu.ug("B.Sc");
		edu.pg(45);
		edu.bsc();
		edu.bEd();
		edu.ba();
		edu.bBa();
	}
}
