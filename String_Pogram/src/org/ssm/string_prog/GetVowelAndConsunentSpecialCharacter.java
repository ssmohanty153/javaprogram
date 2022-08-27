package org.ssm.string_prog;

import java.util.Scanner;

public class GetVowelAndConsunentSpecialCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String st=sca.next();
		sca.close();
		int vc=0,cc=0,sc=0,uc=0,lc=0,dc=0;
		for (int i = 0; i < st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch>'A'&&ch<'Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vc++;
				else
					cc++;

			}
			if(ch>'a'&&ch<'z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;

			}
			else if(ch>='0'&&ch<='9')
			{
				dc++;
			}
			else
				sc++;

		}
		System.out.println("NUmber of vowel is "+ vc);
		System.out.println("NUmber of consulents is "+ cc);
		System.out.println("NUmber of UpperCase is "+ uc);
		System.out.println("NUmber of LowerCase is "+ lc);
		System.out.println("NUmber of digit is "+ dc);
		System.out.println("NUmber of SpecialVjaracter is "+ sc);

	}

}
