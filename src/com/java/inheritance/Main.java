package com.java.inheritance;

public class Main {
	
	public static void main(String[] args) {
		Mercedes mercedes = new Mercedes();
		
		mercedes.setAraba_adi("Mercedes");
		mercedes.setAraba_id(12);
		mercedes.setAraba_model("Mercedes-x");
		mercedes.setAraba_yasi(7);
		mercedes.setAyna_sayisi(5);
		mercedes.setLastik_sayisi(4);
		
		System.out.println(mercedes); //toString methodu olmazsa normalde bu böyle direkt gelmezdi
		
		
		Audi audi = new Audi();
		
		audi.setAraba_adi("Audi");
		audi.setAraba_id(1);
		audi.setAraba_model("Audi A3");
		audi.setAraba_yasi(2);
		audi.setAyna_sayisi(4);
		audi.setLastik_sayisi(6);
		
		System.out.println("\n"+audi);
		System.out.println("********************************************************");
		
		mercedes.Method();
		
		audi.Method();
	}
}
