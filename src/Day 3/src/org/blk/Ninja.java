package org.blk;

public class Ninja extends BMW {
	private void price(float price) {
		System.out.println("Enter Price : "+price);

	}
	
	private void model(int model) {
		System.out.println("Enter Model : "+model);

	}
	
	private void speed(double speed) {
		System.out.println("Enter Speed : "+speed);

	}
	
	@Override
	public void mileage(float mileage) {
		System.out.println("Enter Mileage : "+mileage);
	}
	
	@Override
	public void enginePower(String pow) {
		System.out.println("Enter Engine Power : "+pow);
	}
	public static void main(String[] args) {
		Ninja n = new Ninja();
		n.mileage(67f);
		n.enginePower("100");
		n.price(120000f);
		n.model(2022);
		n.speed(240);
	}

}
