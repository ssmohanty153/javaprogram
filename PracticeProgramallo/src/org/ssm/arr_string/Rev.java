package org.ssm.arr_string;

public class Rev 
{
	static String s;

	public static void main(String[] args) 
	{
		String[] str={"alok","hare Krishna"};
		for (int i = 0; i < str.length; i++) 
		{

			System.out.println(str.length);
			System.out.println(str[i]);
			int x=0;
			while(x<str[i].length())
			{
				System.out.println(str[i].charAt(x));
				x++;
			}

		}




	}

}
