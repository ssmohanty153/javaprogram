package org.ssm.numberSystem;

import java.util.Scanner;

public class TwoDigitNumber 
{
	public static void main(String[] args)
	{
		
	
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int n=sc.nextInt();
 sc.close();
 if(n>9&&n<100)
 {
	 System.out.println(n+" is Two Digit number");
 }
 else
 {
	 System.out.println(n+" is not two digit number");
 }
}
}
