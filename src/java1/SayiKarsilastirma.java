package java1;

import java.util.Scanner;

public class SayiKarsilastirma {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a,b,c;
	System.out.println("En b�y�k say�y� bulan program \n "
			+ "HO�GELD�N�Z");
	System.out.println("Birinci say�y� girin");
	a= scan.nextDouble();
	System.out.println("�kinci say�y� girin");
	b = scan.nextDouble();
	System.out.println("���nc� say�y� girin");
	c = scan.nextDouble();
	if (a>= b && a>=c) 
		System.out.println("Birinci say�s� b�y�kt�r: "+ a);
	else if(b>= a && b>=c)
		System.out.println("�kinci say�s� b�y�kt�r: "+ b);
	else
		System.out.println("���nc� say�s� b�y�kt�r: "+ c);
	
	
} 
}
