package java1;

import java.util.Scanner;

public class Ikisayiarasindakileritoplama {
public static void main(String[] args) {
	int sayi1=0, sayi2=0,sayilar_toplami=0,sayiyiBulma,sonDeger=0;
	Scanner scan= new Scanner(System.in);
	System.out.print("2 Say� giri�i yapman�z gerekiyor!! \n"+ 
	"Birinci say�: ");
	sayi1= scan.nextInt();	
	System.out.print("�kinci say�: ");
	sayi2= scan.nextInt();
	
	if(sayi1>=sayi2)
	{		
		sayi2--;
			sayilar_toplami= sayi1*(sayi1+1)/2;			
			sayiyiBulma= sayi2*(sayi2+1)/2;
			sonDeger= sayilar_toplami-sayiyiBulma;
		sayi2++;
		System.out.println(sayi1 +"'den "+ sayi2+
				"'ye kadar olan say�lar�n toplam�: "+
				sonDeger);
	}		
	else
	{
		sayi1--;
		sayilar_toplami= sayi1*(sayi1+1)/2;			
		sayiyiBulma= sayi2*(sayi2+1)/2;
		sonDeger = sayiyiBulma-sayilar_toplami;
		sayi1++;
		System.out.println(sayi2+"'den " + sayi1+ "'ye kadar "
				+ "olan say�rlar�n toplam�: "+ sonDeger);
	}
	
}
}
