package java1;

import java.util.Scanner;

public class evOdevi {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		double diskriminant = 0;
		double kok1 = 0, kok2 = 0, esitKok = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("3 say� girmeniz gerekiyor!! \n" + "1.Say�: ");
		a = scan.nextInt();
		System.out.print("2.Say�: ");
		b = scan.nextInt();
		System.out.print("3.Say�: ");
		c = scan.nextInt();

		diskriminant = (b * b) + (4 * a * c);
		if (diskriminant < 0) {
			System.out.println("Denklemin ger�el say�larda k�k� yoktur");
		} else if (diskriminant == 0) {
			esitKok = -b / (2 * a);
			System.out.println("�ak���k k�kd�r." + "Diskrimanat: " + esitKok);
		} else {
			kok1 = (b + Math.sqrt(diskriminant) / (2 * a));
			kok2 = (-b - Math.sqrt(diskriminant) / (2 * a));
			System.out.print(
					"Diskriminant 0'dan b�y�kt�r ve 2 ger�ek k�k� vard�r \n" + "1.K�k: " + kok1 + "\n2.K�k: " + kok2);
		}
	}
}
