package com.java.inheritance;

public class Cars {
	private long araba_id;
	private String araba_adi;
	private String araba_model;
	private int araba_yasi;
	private int lastik_sayisi;
	private int ayna_sayisi;
	
	public Cars() {
		
	}
	
	public Cars(long araba_id, String araba_adi, String araba_model, int araba_yasi, int lastik_sayisi,int ayna_sayisi) {
		this.araba_id = araba_id;
		this.araba_adi = araba_adi;
		this.araba_model = araba_model;
		this.araba_yasi = araba_yasi;
		this.lastik_sayisi = lastik_sayisi;
		this.ayna_sayisi = ayna_sayisi;
	}

	public long getAraba_id() {
		return araba_id;
	}

	public void setAraba_id(long araba_id) {
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

	public int getLastik_sayisi() {
		return lastik_sayisi;
	}

	public void setLastik_sayisi(int lastik_sayisi) {
		this.lastik_sayisi = lastik_sayisi;
	}

	public int getAyna_sayisi() {
		return ayna_sayisi;
	}

	public void setAyna_sayisi(int ayna_sayisi) {
		this.ayna_sayisi = ayna_sayisi;
	}

	@Override
	public String toString() {
		return "Cars [araba_id=" + araba_id + ", araba_adi=" + araba_adi + ", araba_model=" + araba_model
				+ ", araba_yasi=" + araba_yasi + ", lastik_sayisi=" + lastik_sayisi + ", ayna_sayisi=" + ayna_sayisi
				+ "]";
	}
	
	public void Method() {
		System.out.println("ID: "+araba_id
				+" ADI: "+araba_adi
				+" MODELI: "+araba_model
				+" YAS: "+araba_yasi
				+" AYNA SAYISI: "+ayna_sayisi
				+" LASTIK SAYISI: "+lastik_sayisi);
	}

}
