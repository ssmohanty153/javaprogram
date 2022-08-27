package org.ssm.Number;

import java.util.Scanner;

public class Angle 
{
public static void main(String [] arg)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the hour and min");
	int hr=sc.nextInt();
	int min=sc.nextInt();
	double h=hr*30+min*5;
	double m=min*6;
	double angle=0;
	if(h>m)
	{
		angle=h-m;
	}
	else
	{
		angle=m-h;
	}
	if(angle>180)
	{
		angle=360-angle;
	}
	System.out.println(" Least angle is  "+angle);
		
	
	
	
			
}

}
