package com.java.interfaces;

public class BMW extends Arabalar implements IAkilliSensor{

	@Override
	public void akilliSensorX() {
		System.out.println("BMW Akilli Sensor X");
	}

	@Override
	public void akilliLamba() {
		System.out.println("BMW Akilli Lamba X");
	}

	@Override
	public void Ad() {
		
	}
	
}
