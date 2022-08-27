package org.ssm.Number;
import java.util.Scanner;
public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		sc.close();
		String b=decimalToBinary(n);
		System.out.println(b);
	}
	static String decimalToBinary(int n) 
	{
		String bin="";
		do
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}
		while(n!=0);
			return bin;
		
	}
}