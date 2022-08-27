package org.ssm.array;
import java.util.Scanner;
import java.util.LocalTime;
public class Convert 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String str=sc.nextLine();
		int age=getAge(str);
		System.out.println(age);


	}

	public static int getAge(String dob)
	{
		char ch[]=dob.toCharArray();
		dob="";
		int result=0;
		int sum=0,sum1=0,sum2=0;
		for (int i = 0; i < ch.length; i++) 
		{

			sum=sum+(ch[i]-48);


		}
		for (int i = 4; i < ch.length; i++) 
		{

			
			

		}
		for (int i = 7; i < ch.length; i++) 
		{

			sum2=sum2+(ch[i]-48);


		}
		/*k=1+4;
			if(k>=5&&k<7)
			{
				while(k<7)
				{
					sum1=sum1*10+(ch[k]-48);
					k++;
				}
			}
			k=6+2;

			if(k>=8&&k<10)
			{
				while(k<10)
				{
					sum2=sum2+(ch[i]-48);
					k++;
				}

			}*/


		result=sum-10+sum2;

		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		 


		return result;

	}
}
