package SoftwareTesting.src.org.sof;

public class Automation {
	private void junitFramework() {
		System.out.println("This is Automation Junit Framework");

	}
	private void testingFramework() {
		System.out.println("This is Automation Testing Framework");

	}
	private void cucumberFramework() {
		System.out.println("This is Automation Cucumber Framework");
		System.out.println("*****");

	}


public static void main(String[] args) {
	Automation a = new Automation();
	Manual m = new Manual();
	a.junitFramework();
	a.testingFramework();
	a.cucumberFramework();
	m.sdlc();
	m.stlc();
	m.bugLifecycle();
}
}


