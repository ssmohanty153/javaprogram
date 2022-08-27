package com.ssm.Array;
import java.util.Scanner;
public class AvetrageOfNumber {
	public static void main(String[] args) 
	{
		double weight[]=new double[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 8 weight ");
		for (int i = 0; i <8; i++) 
		{
			weight[i]=sc.nextDouble();
		}
		sc.close();
		double sum=0;
		for (int i = 0; i < weight.length; i++)
		{
			System.out.println(i+" person weight is :"+ weight[i]);
			sum=sum+weight[i];
		}
		System.out.println("anerage weight:-"+(sum/8));
		}

}
