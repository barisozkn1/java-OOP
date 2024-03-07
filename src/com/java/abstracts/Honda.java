package com.java.abstracts;

public class Honda extends Arabalar{  //bu classta Arabalar classındaki abstract metodu(ad metodunu) override etmezsen hata verir.

	@Override
	public void Ad() {
		System.out.println("Honda adı");
		
	}   
	
}
