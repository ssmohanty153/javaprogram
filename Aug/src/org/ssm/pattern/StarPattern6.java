package org.ssm.pattern;
public class StarPattern6 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=i;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(k);
				if(j<=(2*i-1)/2)
				{
					k--;
				}
				else
					k++;
			}
			System.out.println();
		}
	}
}
