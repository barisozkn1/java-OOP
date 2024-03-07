package com.java.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * LAVS YAPISI yani
 * Linkedlist, Arraylist, Vector ve Stack yer alır.
 */
public class List_001 {

	public static void main(String[] args) {
		List<Integer> listPro=new ArrayList<>();
		
		listPro.add(42);
		listPro.add(52);
		listPro.add(62);
		listPro.add(72);
		
		/*
		Integer a1=listPro.get(1);
		System.out.println("degisken atamali: "+a1);
		*/
		
		for (int i = 0; i < listPro.size(); i++) {
			System.out.println(listPro.get(i));
		}
		listPro.remove(1);
		System.out.println("\n1. indexteki deger silindi\n");
		
		//foreach yapısı.
		for (Integer integer : listPro) {
			System.out.println(integer);
		}
		System.out.println("\n/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
		listPro.subList(0, 1); //araliktaki elemanları getirir.
		Iterator<Integer> ite=listPro.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("\nTUM YAPILAR SİLİNİYOR.");
		listPro.clear(); //listeyi temizler
		for (Integer integer : listPro) {
			System.out.println(integer);
		}
		System.out.println("\nTUM YAPILAR SİLİNDİ.");
		
		
	}

}
