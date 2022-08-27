package org.ssm.Number;
import java.util.Scanner;
public class Power 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number");
	int p=sc.nextInt();
	System.out.println("Enter the second number");
	int r=sc.nextInt();
	int x=power(p,r);
	System.out.println(x);
	
	
}
static int power(int x,int y)
{
	int sum=1;
	for (int i = 1; i <=y ; i++) 
	{
		sum=sum*y;
	}
	return sum;
	
}
}
