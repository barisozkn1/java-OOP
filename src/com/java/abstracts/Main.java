package com.java.abstracts;

public class Main {

	public static void main(String[] args) {
		Ferrari ferrari=new Ferrari();
		
		ferrari.setAraba_adi("Ferrari");
		ferrari.setAraba_id(1907);
		ferrari.setAraba_model("Ferrari XL10");
		ferrari.setAraba_yasi(3);
		
		ferrari.Method(); //polymorphism metot
		ferrari.Ad(); //abstract gövdesiz metot(aynı zaman da polymorphism de)
		
		Honda honda=new Honda();
		
		honda.setAraba_adi("Honda");
		honda.setAraba_id(1);
		honda.setAraba_model("Honda Civic");
		honda.setAraba_yasi(7);
		
		honda.Method();
		honda.Ad(); //abstract gövdesiz metot
	}

}
