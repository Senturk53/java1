package java1;

import java.util.Scanner;

public class sinif {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bolunen,bolen,kalan,bolum;
		System.out.println("B�l�necek Say�: ");
		bolunen= scan.nextInt();
		System.out.println("B�lecek  Say�: ");
		bolen= scan.nextInt();
		
		bolum = bolunen / bolen;
		kalan = bolunen % bolen;		
		
		System.out.println(bolunen+ " / " + bolen);
		System.out.println("B�l�m :" + bolum +"\nKalan: "+ kalan);
		
		
		
		
	}

}
