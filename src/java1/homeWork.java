package java1;
import java.util.Scanner;
public class homeWork {
public static void main(String[] args) {
	int a = 0, b=0,c=0;
	double diskriminant=0;
	double kok1 = 0, kok2=0;
	
	Scanner scan = new Scanner(System.in);
	System.out.printf("3 say� girmeniz gerekiyor!! \n "
			+ "1.Say�: %d \n"+"2.Say�: %d \n"+"3.Say�: %d \n",a=scan.nextInt(),
			b=scan.nextInt(),c=scan.nextInt());
	diskriminant= (b*b)+(4*a*c);
	if(diskriminant<0)
	{
		System.out.println("Denklemin ger�el say�larda k�k� yoktur");
	}
	else if(diskriminant==0)
	{
		System.out.println("�ak���k k�kd�r."
				+ "Diskrimanat: "+diskriminant);
	}
	else
	{
		kok1 =(b+Math.sqrt(diskriminant)/(2*a));
		kok2=(-b-Math.sqrt(diskriminant)/(2*a));
		System.out.printf("Diskriminant 0'dan b�y�kt�r ve 2 ger�ek k�k� vard�r"+
				"1.K�k: %d \n"+ "2.K�k: %d \n",kok1,kok2 );
	}
}
}
