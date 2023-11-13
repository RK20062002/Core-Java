package CompanyDetails.src.org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("This is Inmakes InfoTech");

	}
	private void companyId() {
		System.out.println("2012");

	}
	private void companyAddress() {
		System.out.println("Chennai");

	}
	
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
