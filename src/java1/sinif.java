package java1;

import java.util.Scanner;

public class sinif {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bolunen,bolen,kalan,bolum;
		System.out.println("Bölünecek Sayý: ");
		bolunen= scan.nextInt();
		System.out.println("Bölecek  Sayý: ");
		bolen= scan.nextInt();
		
		bolum = bolunen / bolen;
		kalan = bolunen % bolen;		
		
		System.out.println(bolunen+ " / " + bolen);
		System.out.println("Bölüm :" + bolum +"\nKalan: "+ kalan);
		
		
		
		
	}

}
