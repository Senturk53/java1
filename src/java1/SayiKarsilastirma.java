package java1;

import java.util.Scanner;

public class SayiKarsilastirma {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a,b,c;
	System.out.println("En büyük sayýyý bulan program \n "
			+ "HOÞGELDÝNÝZ");
	System.out.println("Birinci sayýyý girin");
	a= scan.nextDouble();
	System.out.println("Ýkinci sayýyý girin");
	b = scan.nextDouble();
	System.out.println("Üçüncü sayýyý girin");
	c = scan.nextDouble();
	if (a>= b && a>=c) 
		System.out.println("Birinci sayýsý büyüktür: "+ a);
	else if(b>= a && b>=c)
		System.out.println("Ýkinci sayýsý büyüktür: "+ b);
	else
		System.out.println("Üçüncü sayýsý büyüktür: "+ c);
	
	
} 
}
