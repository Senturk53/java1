package java1;

import java.util.Scanner;

public class girilen_sayinin_carpim_tablosu {
public static void main(String[] args) {
	int girilenSayi,carpim;
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir tam say� giri�i yap�n�z");
	girilenSayi = scan.nextInt();
	for (int i =0; i< 11;i++) 
	{
		carpim=i*girilenSayi;
		System.out.println(girilenSayi + " * "+ i+"= "+carpim);
		
	}
}
}
