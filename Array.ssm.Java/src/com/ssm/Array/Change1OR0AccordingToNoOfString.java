package com.ssm.Array;

import java.util.Scanner;

public class Change1OR0AccordingToNoOfString 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string size :");
int size=sc.nextInt();
int ar[]=new int[size];
System.out.println("enter the "+size+" number");
int count=0;
for (int i = 0; i < ar.length; i++)
{
	ar[i]=sc.nextInt();
}

for (int i = 0; i < ar.length; i++) 
{
	System.out.print(ar[i]+",");
	count++;
}
if(count%2==1)
{
	for (int i = 0; i < ar.length; i++)
	{
		ar[i]=1;
	}
}
else
{
	for (int i = 0; i < ar.length; i++)
	{
		ar[i]=0;
	}
}
System.out.println();

System.out.println("after the changing :");
for (int i = 0; i < ar.length; i++) 
{
	System.out.print(ar[i]+",");
}
}
}
