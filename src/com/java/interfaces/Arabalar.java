package com.java.interfaces;

abstract public class Arabalar {
	
	//genel ortak özellikler
	protected String araba_adi;
	protected String araba_model;
	protected int araba_yasi;
	protected double araba_id;
	
	
	public Arabalar() {
		
	}
	
	public Arabalar(String araba_adi, String araba_model, int araba_yasi, double araba_id) {
		this.araba_adi = araba_adi;
		this.araba_model = araba_model;
		this.araba_yasi = araba_yasi;
		this.araba_id = araba_id;
	}

	public String getAraba_adi() {
		return araba_adi;
	}

	public void setAraba_adi(String araba_adi) {
		this.araba_adi = araba_adi;
	}

	public String getAraba_model() {
		return araba_model;
	}

	public void setAraba_model(String araba_model) {
		this.araba_model = araba_model;
	}

	public int getAraba_yasi() {
		return araba_yasi;
	}

	public void setAraba_yasi(int araba_yasi) {
		this.araba_yasi = araba_yasi;
	}

	public double getAraba_id() {
		return araba_id;
	}

	public void setAraba_id(double araba_id) {
		this.araba_id = araba_id;
	}
	
	public void Method() {
		System.out.println("ID: "+araba_id
				+" ## ADI: "+araba_adi
				+" ## MODELI: "+araba_model
				+" ## YASI: "+araba_yasi);
	}
	
	abstract public void Ad();//gövdesiz abstract metot.
	
	
}
