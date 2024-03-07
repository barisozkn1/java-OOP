package com.java.oop;

public class ToStrings {
	
	private String ad;
	private String soyad;
	
	public ToStrings() {
		
	}
	
	public ToStrings(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Override
	public String toString() {
		return "ToStrings [ad=" + ad + ", soyad=" + soyad + "]";
	}
	
	
}
