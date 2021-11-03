package java1.Okul;

import java.util.Scanner;

public class Örnekler {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Öðrenci Numaranýzý Girin: ");
		int ogrenciNumarasi = scan.nextInt();

		System.out.print("Adýnýzý Girin: ");
		scan = new Scanner(System.in);
		// scan.next();//scanner nesnesinde 2 farklý tip deðer alýrken içini
		// boþaltmak için kullanýlýr
		String ogrenciAdi = scan.nextLine();

		System.out.print("Vize notunuzu giriniz: ");
		int vizeNotu = scan.nextInt();

		System.out.print("Final notunuzu giirn: ");
		int finalNotu = scan.nextInt();

		// ctrl+shift+f kodlarý düzenler
		
		double ortalama = (vizeNotu * 0.3) + (finalNotu * 0.7);

		System.out.printf("Adý %S olan öðrenci numarasý %d olan kiþinin not ortalamasý: %f", ogrenciAdi,
				ogrenciNumarasi, ortalama);

	}
}
