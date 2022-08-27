//n=59
//5*9+5+9=59 so it is special digit number 
package org.ssm.numberSystem;
import java.util.Scanner;
public class SpecialDigit 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the two digit number");
	int n=sc.nextInt();
	sc.close();
	int d1=n/10;
	int d2=n%10;
	int sum=d1+d2+d1*d2;
	if(sum==n)
	{
		System.out.println(n+" is Special digit");
	}
	else
	{
		System.out.println(n+" is not special degit number");
	}
}
}
