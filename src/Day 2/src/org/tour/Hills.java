package org.tour;

public class Hills extends ThemePark {
	private void munnar() {
		System.out.println("This is Munnar");

	}
	
	private void wagomon() {
		System.out.println("This is wagomon");

	}
	
	public static void main(String[] args) {
		Hills tour = new Hills();
		tour.marinaBeach();
		tour.mahabalipuramBeach();
		tour.wonderla();
		tour.blackThunder();
		tour.munnar();
		tour.wagomon();
	}

}
