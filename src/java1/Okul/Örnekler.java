package java1.Okul;

import java.util.Scanner;

public class �rnekler {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("��renci Numaran�z� Girin: ");
		int ogrenciNumarasi = scan.nextInt();

		System.out.print("Ad�n�z� Girin: ");
		scan = new Scanner(System.in);
		// scan.next();//scanner nesnesinde 2 farkl� tip de�er al�rken i�ini
		// bo�altmak i�in kullan�l�r
		String ogrenciAdi = scan.nextLine();

		System.out.print("Vize notunuzu giriniz: ");
		int vizeNotu = scan.nextInt();

		System.out.print("Final notunuzu giirn: ");
		int finalNotu = scan.nextInt();

		// ctrl+shift+f kodlar� d�zenler
		
		double ortalama = (vizeNotu * 0.3) + (finalNotu * 0.7);

		System.out.printf("Ad� %S olan ��renci numaras� %d olan ki�inin not ortalamas�: %f", ogrenciAdi,
				ogrenciNumarasi, ortalama);

	}
}
