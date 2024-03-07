package com.java.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		Set<Integer> setList=new HashSet<Integer>(); //tekrarsız şekilde küçükten büyüğe yazdırıldı bu yapıda
		setList.add(10);
		setList.add(10);
		setList.add(10);
		setList.add(10);
		setList.add(5);
		setList.add(6);
		setList.add(9);
		setList.add(1);
		setList.add(9);
//		
		System.out.println("HASHSET");
//	
		for (Integer integer : setList) {
			System.out.println(integer);
		}
//		
		System.out.println("\nLINKEDHASHSET");
//		
		Set<Integer> setLinked=new LinkedHashSet<Integer>();  //Bu yapıda ekledigimiz sırada yine tekrarsız şekilde ekrana yazdırtır.
		
		setLinked.add(10);
		setLinked.add(4);
		setLinked.add(12);
		setLinked.add(8);
		setLinked.add(8);
		setLinked.add(10);
		setLinked.add(4);
		
		for (Integer x : setLinked) {
			System.out.println(x);
		}
//		
		System.out.println("\nTREESET");
//		
		Set<Integer> setTree=new TreeSet<Integer>();    //Bu yapıda küçükten büyüğe, tekrarsız şekilde ekrana yazdırtır.
		
		setTree.add(10);
		setTree.add(5);
		setTree.add(8);
		setTree.add(8);
		setTree.add(40);
		setTree.add(10);
		setTree.add(10);
		setTree.add(6);
		
		for (Integer y : setTree) {
			System.out.println(y);
		}
	}

}
