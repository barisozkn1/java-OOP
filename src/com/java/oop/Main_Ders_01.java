package com.java.oop;

public class Main_Ders_01 {

	public static void main(String[] args) {
		Ders_01_Class oop1= new Ders_01_Class();
		
		oop1.setX(10);
		oop1.setY(5);
		System.out.println(oop1.getX());
		System.out.println(oop1.getY());
		System.out.println("***************************************************");
		
		System.out.println(oop1.toplam(oop1.getX(), oop1.getY()));
		
		System.out.println(oop1.toplam(4,5));
		
		System.out.println("\n");
		
		ToStrings to = new ToStrings("Baris", "Ozkan");
		
//		System.out.println(to); //böyle yazdırdıgımız zaman hafızadaki yerini göstermekte şuan da. Bunun farkı için classtaki override edilmsi tostring deaktif et.
		
		System.out.println("\nTOSTRINGS CLASSINDA TOSTRING OVERRIDE ETTİKTEN SONRA YAZDIRMA"); //farkı için ToStrings classındakı override metotunu devre dışı bırak.
		
		System.out.println(to);

	}

}
