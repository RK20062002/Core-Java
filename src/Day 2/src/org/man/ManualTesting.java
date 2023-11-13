package org.man;

import org.aut.*;

/*
 * When we use another class 
 * from another package 
 * then it will import
*/

public class ManualTesting extends AutomationTesting {
	private void regressionTesting() {
		System.out.println("It is focuses on verifying that recent code changes.");

	}
	private void reTesting() {
		System.out.println("Test cases that previously identified defects or failures");

	}
	public static void main(String[] args) {
		ManualTesting testing = new ManualTesting();
		testing.softwareName();
		testing.testingFramework();
		testing.cucumberFramework();
		testing.regressionTesting();
		testing.reTesting();
	}

}
