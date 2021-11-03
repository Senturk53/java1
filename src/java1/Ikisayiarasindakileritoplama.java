package java1;

import java.util.Scanner;

public class Ikisayiarasindakileritoplama {
public static void main(String[] args) {
	int sayi1=0, sayi2=0,sayilar_toplami=0,sayiyiBulma,sonDeger=0;
	Scanner scan= new Scanner(System.in);
	System.out.print("2 Sayý giriþi yapmanýz gerekiyor!! \n"+ 
	"Birinci sayý: ");
	sayi1= scan.nextInt();	
	System.out.print("Ýkinci sayý: ");
	sayi2= scan.nextInt();
	
	if(sayi1>=sayi2)
	{		
		sayi2--;
			sayilar_toplami= sayi1*(sayi1+1)/2;			
			sayiyiBulma= sayi2*(sayi2+1)/2;
			sonDeger= sayilar_toplami-sayiyiBulma;
		sayi2++;
		System.out.println(sayi1 +"'den "+ sayi2+
				"'ye kadar olan sayýlarýn toplamý: "+
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
				+ "olan sayýrlarýn toplamý: "+ sonDeger);
	}
	
}
}
