package org.ssm.string_prog;

public class ReplaceCharinStar 
{
	public static void main(String[] args)
	{  
		String str = "hareKrishna";  
		int count;  


		str = str.toLowerCase();

		//	String words[] = string.split(" "); 
		char []ch=str.toCharArray();

		System.out.println("Duplicate words in a given string : ");  
		for(int i = 0; i < ch.length; i++)
		{  
			count = 1;  
			for(int j = i+1; j < ch.length; j++)
			{  
				if(ch[i]==(ch[j]))
				{  
					count++;  
					ch[j] = 0;  
				}  
			}



			if(count == 1 && ch[i] !=0)
				System.out.print(ch[i]);
			else
				System.out.print("*");  
		}  

	}
}





