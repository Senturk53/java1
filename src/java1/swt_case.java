package java1;

import java.util.Scanner;

public class swt_case {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	
int i=0;
System.out.println("7'ye kadar bir say� girin");
i = scan.nextInt();
	

switch (i) {

case 1:
System.out.println("Pazartesi");	
	break;
case 2:
	System.out.println("Sal�");
	break;
case 3:
	System.out.println("�ar�amba");
	break;
case 4:
	System.out.println("Per�embe");
break;
case 5:
	System.out.println("Cuma");
break;
case 6:
	System.out.println("Cumartesi");
break;
case 7:
	System.out.println("Pazar");
break;
default :
	System.out.println("7'ye giri� yapabilirsiniz");
	break;
	
}
}
}
