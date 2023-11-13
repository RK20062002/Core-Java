package org.car;

public class Lancer extends Skoda {
	private void seater(int no) {
		System.out.println("Enter No of Seater : "+no);

	}
	
	private void window(int window) {
		System.out.println("Enter No of window : "+window);

	}
	
	private void mileage(float mileage) {
		System.out.println("Enter Mileage : "+mileage);

	}
	
	private void enginePower(double pow) {
		System.out.println("Enter Engine Power : "+pow);

	}
	
	@Override
	public void price(float price) {
		System.out.println("Enter Price : "+price);
		
	}
	
	@Override
	public void model(int model) {
		System.out.println("Enter Model : "+model);
		
	}
	
	public static void main(String[] args) {
		Lancer car = new Lancer();
		car.price(220000f);
		car.model(2018);
		car.seater(6);
		car.window(4);
		car.mileage(25f);
		car.enginePower(280);
	}

}
