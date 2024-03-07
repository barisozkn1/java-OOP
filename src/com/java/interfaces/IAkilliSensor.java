package com.java.interfaces;

public interface IAkilliSensor {
	
	 void akilliSensorX();  //bu iki farklı özelligi istedigimiz sınıfta implements yardımı ile kullanırız.
	 void akilliLamba();

	 default public void deneme1() { //baştaki default koymazsak bize gövdeli metot kullanımı yaptırtmaz
		 System.out.println("DEFAULTLU GOVDELİ METOT INTERFACE DE");
	}
	 
}
