package org.ssm.This3;

import java.util.Scanner;

public class VenderMAchine 
{
Bevage give()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the choice");
	System.out.println("1- coffee "+" 2-tea");
	int choice=sc.nextInt();
	if(choice==1)
	{
		Coffee c=new Coffee();
		return c;
	}
	else
	{
		Tea t=new Tea();
		return t;
	}
	
	
	
}
public static void main(String[] args) 
{
	VenderMAchine vm=new VenderMAchine();
	Bevage b=vm.give();
	System.out.println(b);
}
}
