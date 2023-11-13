package org.sof;

public class Multimedia extends SoftwareTesting {
	private void adobePhotoshop() {
		System.out.println("This is Adobe Photoshop");

	}
	
	private void indesign() {
		System.out.println("This is Indesign");
		System.out.println("****************");

	}
	
	public static void main(String[] args) {
		Multimedia m = new Multimedia();
		m.contentMarketing();
		m.searchEngine();
		m.coreJava();
		m.advanceJava();
		m.manualTesting();
		m.automationTesting();
		m.adobePhotoshop();
		m.indesign();
	}

}
