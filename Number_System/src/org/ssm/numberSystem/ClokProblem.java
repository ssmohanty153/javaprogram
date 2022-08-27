package org.ssm.numberSystem;

import java.util.Scanner;

public class ClokProblem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the hour clock");
		int n1=sc.nextInt();
		System.out.println("Enter the the minites clock");
		int n2=sc.nextInt();
		double angleh=n1*30+n2*0.5;
		double anglem=n2*6;
		double angle;
		sc.close();
		if(angleh>anglem)
		{
			angle=angleh-anglem;
			
			
		}
		else
		{
			angle=anglem-angleh;	
		}
		if(angle>180)
		{
			angle=360-angle;
		}
		System.out.println("least angle is "+angle);
	}
}
