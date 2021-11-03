package java1;
import java.util.Scanner;
public class homeWork {
public static void main(String[] args) {
	int a = 0, b=0,c=0;
	double diskriminant=0;
	double kok1 = 0, kok2=0;
	
	Scanner scan = new Scanner(System.in);
	System.out.printf("3 sayý girmeniz gerekiyor!! \n "
			+ "1.Sayý: %d \n"+"2.Sayý: %d \n"+"3.Sayý: %d \n",a=scan.nextInt(),
			b=scan.nextInt(),c=scan.nextInt());
	diskriminant= (b*b)+(4*a*c);
	if(diskriminant<0)
	{
		System.out.println("Denklemin gerçel sayýlarda kökü yoktur");
	}
	else if(diskriminant==0)
	{
		System.out.println("Çakýþýk kökdür."
				+ "Diskrimanat: "+diskriminant);
	}
	else
	{
		kok1 =(b+Math.sqrt(diskriminant)/(2*a));
		kok2=(-b-Math.sqrt(diskriminant)/(2*a));
		System.out.printf("Diskriminant 0'dan büyüktür ve 2 gerçek kökð vardýr"+
				"1.Kök: %d \n"+ "2.Kök: %d \n",kok1,kok2 );
	}
}
}
