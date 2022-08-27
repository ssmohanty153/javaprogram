package org.ssm.string;

public class Number 
{
	public static void main(String[] args) 
	{


		/*
		 * 5 => 1- 2+ 3 - 4+5 = 3 
		 * 6 => 1-2+3-4+5-6 = -3 
		 * 12 => 1-2+3-4+5-6+7-8+9 - 1+ 0 -1+1 -1+2 = 3
		 * 
		 * every digit will a have a alternte + - sigh
		 */


		int n = 13,result = 0;
		String out = "";
		int counter = 1;
		for (int i = 1; i <= n; i++)
		{
			String digit = i + "";
			//System.out.println(digit.length());
			
			for (int j = 0; j < digit.length(); j++) 
			{
				if(counter%2 == 1)
				{
					out += " + " + digit.charAt(j);
					System.out.println("ssm"+digit.charAt(j));
					result += (int)digit.charAt(j)-48;
					//System.out.println(result);
				}
				else
				{
					//System.out.println(digit.charAt(j));
					out += " - " + digit.charAt(j);
					result -= (int)digit.charAt(j)-48;
					//System.out.println(result);
				}
				counter++;
			}
		}
		System.out.println(out + " --> " + result);
	}
}


