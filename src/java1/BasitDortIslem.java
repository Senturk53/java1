package java1;

import java.util.Scanner;

public class BasitDortIslem {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.print("Bir say� se�iniz \n"+
	"Toplama i�lemi= 1 \n"
	+ "��karma i�lemi = 2\n"
	+ "�arpma i�lemi = 3\n"
	+ "B�lem i�lemi = 4 \n");
	int key =0,sayi1=0,sayi2=0, toplam =0;
	key = scan.nextInt();
	switch (key) {
	case 1:
		System.out.print("Birinci Say�= ");
		sayi1 = scan.nextInt();
		System.out.print("�kinci Say�= ");
		sayi2 = scan.nextInt();	
		toplam = sayi1+ sayi2;
		System.out.print("�ki say�n�n toplam� = " + toplam);
		break;

	default:
		System.out.println("0 ile 4 aras�nda say� girmniz gerekiyor");
		break;
	}
}
}
