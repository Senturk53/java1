package java1;

import java.util.Scanner;

public class BasitDortIslem {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.print("Bir sayý seçiniz \n"+
	"Toplama iþlemi= 1 \n"
	+ "Çýkarma iþlemi = 2\n"
	+ "Çarpma iþlemi = 3\n"
	+ "Bölem iþlemi = 4 \n");
	int key =0,sayi1=0,sayi2=0, toplam =0;
	key = scan.nextInt();
	switch (key) {
	case 1:
		System.out.print("Birinci Sayý= ");
		sayi1 = scan.nextInt();
		System.out.print("Ýkinci Sayý= ");
		sayi2 = scan.nextInt();	
		toplam = sayi1+ sayi2;
		System.out.print("Ýki sayýnýn toplamý = " + toplam);
		break;

	default:
		System.out.println("0 ile 4 arasýnda sayý girmniz gerekiyor");
		break;
	}
}
}
