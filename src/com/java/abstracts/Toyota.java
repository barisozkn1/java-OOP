package com.java.abstracts;

public class Toyota extends Arabalar{ //bu classta Arabalar classındaki abstract metodu(ad metodunu) override etmezsen hata verir.

	@Override  
	public void Ad() {  //abstract gövdesiz olan yapıyı bu sınıfta tekrar override edip içini doldurmak zorundayız.
		System.out.println("Toyota adı");
	}   
	
}
