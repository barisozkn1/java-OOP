package com.java.abstracts;

public class Ferrari extends Arabalar{ //bu classta Arabalar classındaki abstract metodu(ad metodunu) override etmezsen hata verir.
	
	@Override
	public void Ad() {
		System.out.println("ferrari adı");
	}
}
