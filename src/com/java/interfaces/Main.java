package com.java.interfaces;

public class Main {

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.setAraba_adi("BMW");
		bmw.setAraba_id(07);
		bmw.setAraba_model("BMW 6");
		bmw.setAraba_yasi(5);
		bmw.Method();
		bmw.akilliSensorX();
		bmw.akilliLamba();
		bmw.deneme1();//default kullandıgımız için gövdeli metotu kullanabildik interface yapısında
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		
		Volvo volvo=new Volvo();
		volvo.setAraba_adi("VOLVO");
		volvo.setAraba_id(193);
		volvo.setAraba_model("VOLVO S90");
		volvo.setAraba_yasi(2);
		volvo.Method();
		volvo.akilliSensorX();
		volvo.akilliLamba();
		
	}
	
}
