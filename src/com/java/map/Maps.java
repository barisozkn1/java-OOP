package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Hashtable:Hashtable da null degıskeni alamayız fakat hashmapte null alınabilir.
 * HashMap: indiz lazım degil bunda kafasına göre yazar.
 * LinkedHashMap:yazdıgımız sırada indis lazım oldugunda öyle yazdırır. 
 * TreeMap:büyükten kucuge sıralama
 */

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> mapList=new HashMap<Integer, String>();
		mapList.put(1, "Adana");
		mapList.put(2, "Adıyaman");
		mapList.put(3, "Afyon");
		mapList.put(4, "Ağrı");
		mapList.put(5, "Amasya");
		
		//sadece keyleri yazdırma
		System.out.println("SADECE KEY DEGERLERİ");
		for (Integer keys : mapList.keySet()) {
			System.out.println(keys);
		}
		
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("KEY DEGERLERİ UZERINDEN VALUE DEGERLER");
		//key degerleri uzerinden value degerlerini yazdırma
		for (Integer x : mapList.keySet()) {   //bu yapıyı bilmek daha çok iş yapar. Istersen key istersen value istersen de ikisini de yazdırabilirsin.
				String hepsi=mapList.get(x);
				System.out.println(hepsi);
		}
		
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("SADECE VALUE DEGERLER");
		//Sadece values degerleri yazdırma
		for (String values : mapList.values()) {
			System.out.println(values);
		}
		
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("MAP.ENTRY YAPISI ILE KEY VALUE");
		//Key, Value degerleri yan yana direkt yazdırma
		for (Entry<Integer, String> m: mapList.entrySet()) {
			System.out.println(m);
		}
		
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("SET VE ITERATOR ILE KEY VALUE");
		//Set ve iterator yapısı ile key value degerlerini yan yana yazdıralım
		Set mapSet=mapList.entrySet();
		Iterator ite=mapSet.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		//LAMBDA MAP yapısı ile hepsini ekrana yazdırma
		System.out.println("LAMBDA MAP YAPISI ILE KEY-VALUE YAZDIRMA");
		mapList.entrySet().forEach(System.out::println);
		
	}

}
