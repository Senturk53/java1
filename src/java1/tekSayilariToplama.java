package java1;

import java.util.Scanner;

public class tekSayilariToplama {
public static void main(String[] args) {
	int sayi=0,toplam=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Tek sayý kaça kadar toplanacak?");
	sayi = scan.nextInt();
	for(int i=1;i<=sayi;i++)
	{
		if(i%2==1)
		{
			toplam +=i ;		
		}		
	}
	System.out.println("Tek sayýlarýn toplamý: "+ toplam);
	
}
}
