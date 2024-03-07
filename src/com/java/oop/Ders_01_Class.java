//MODEL YAPISI AYNI ZAMAN DA BUS

package com.java.oop;

public class Ders_01_Class {
	
	//Aşağıdaki yapı POJO yapısı field alan + getter and setters kısmı
	//Peki BEANS yapısı nedir --> POJO + CONSTRUCTOR demek
	
	//field alanlarımız
	private int x; //Nesne degiskeni default degeri 0 dır.
	private int y; //nesne degiskeni
	
	//parametresiz constructor
	public Ders_01_Class() {
	}
	
	
	//parametreli constructor
	public Ders_01_Class(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Method
	public int toplam(int a, int b) {
		return(a + b);
	}
	

	//Getter and Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	

}
