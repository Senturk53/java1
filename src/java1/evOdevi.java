package java1;

import java.util.Scanner;

public class evOdevi {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double diskriminant = 0;
		double kok1 = 0, kok2 = 0, esitKok = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("3 sayý girmeniz gerekiyor!! \n" + "1.Sayý: ");
		a = scan.nextInt();
		System.out.print("2.Sayý: ");
		b = scan.nextInt();
		System.out.print("3.Sayý: ");
		c = scan.nextInt();

		diskriminant = (b * b) + (4 * a * c);
		if (diskriminant < 0) {
			System.out.println("Denklemin gerçel sayýlarda kökü yoktur");
		} else if (diskriminant == 0) {
			esitKok = -b / (2 * a);
			System.out.println("Çakýþýk kökdür." + "Diskrimanat: " + esitKok);
		} else {
			kok1 = (b + Math.sqrt(diskriminant) / (2 * a));
			kok2 = (-b - Math.sqrt(diskriminant) / (2 * a));
			System.out.print(
					"Diskriminant 0'dan büyüktür ve 2 gerçek kökü vardýr \n" + "1.Kök: " + kok1 + "\n2.Kök: " + kok2);
		}
	}
}
