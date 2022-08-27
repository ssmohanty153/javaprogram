import java.util.Scanner;

public class PassA 
{/*
	public static void main(String [] args) 
	{
		PassA p = new PassA();
		p.start();
	}

	void start() 
	{
		long [] a1 = {3,4,5};

		long [] a2 = fix(a1);
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println(a1[i]);
		}
		System.out.print(a1[0] + a1[1] + a1[2] + " ");

		System.out.println(a2[0] + a2[1] + a2[2]);
	}

	long [] fix(long [] a3) 
	{
		a3[1] = 7;
		return a3;
	}
 */

	/*public static void main(String [] args) 
	    {
		 PassA p = new PassA ();
	        p.start();
	    }

	    void start() 
	    {
	        boolean b1 = false;
	        boolean b2 = fix(b1);
	        System.out.println(b1 + " " + b2);
	    }

	    boolean fix(boolean b3) 
	    {
	        b3 = true;
	        return b3;
	    }*/




	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String str2=change(str);
		System.out.println(str2);
		sc.close();



	}

	static String change(String str) 
	{
	char [] ch=str.toCharArray();
	str="";
	for (int i = 0; i < ch.length; i++) 
	{
		int k=i;
		while(i<ch.length&&ch[i] !=' ')
		{
			i++;

		}
		int j=i-1;
		while(j>=k)
		{
			str=str+ch[j];
			j--;
		}
		if(i<ch.length)
		{
			str=str+ch[i];
		}

	}


		return str;
	}*/
	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String str2=change(str);
		System.out.println(str2);
		sc.close();



	}

	static String change(String str) 
	{

		char[] ch = str.toCharArray();
		str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0&&ch[i] != ' ')
			{

				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				str=str+ch[j];

				j++;
			}
			if(i>=0)
			{
				str=str+ch[i];
			}
		}
		return str;

	}*/
	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String str2=FirstLetterCApitalp(str);
		System.out.println(str2);
		sc.close();



	}

	static String FirstLetterCApitalp(String str) 
	{
		char ch[]=str.toCharArray();
		str="";
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);

				}

			}
			str=str+ch[i];

		}
		return str;
	}*/
	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		countNo(str);
		sc.close();



	}

	static void countNo(String str) 
	{
		char ch[]=str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{int no=0;
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
			{
				no=no*10+(ch[i]-48);
				i++;
			}
			count++;

			}

		}
		System.out.println(count);


	}*/
	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str=sc.nextLine();
		boolean str2=pelindrum(str);
		if(str2)
		{
			System.out.println("its pelindum");
		}
		else
			System.out.println("not pelindum");
	}
	private static boolean pelindrum(String str) 
	{char ch[]=str.toCharArray();
	int i=0;
	int l=ch.length;
	if(i<l&&ch[i++]==ch[l--])
	{
		return true;
	}
	return false;
	}*/
	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str=sc.nextLine();
		boolean str2=pelindrum(str);
		if(str2)
		{
			System.out.println("its pelindum");
		}
		else
			System.out.println("not pelindum");
	}
	private static boolean pelindrum(String str) 
	{
		char ch[]=str.toCharArray();
		return false;

	}*/

	/*public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean str3=stringISpresent(str1,str2);
		if(str3)
		{
			System.out.println("its stringISpresent");
		}
		else
			System.out.println("not stringISpresent");
	}
	static boolean stringISpresent(String str1, String str2) 
	{
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int i=0;
		while(i<ch1.length)
		{
			int k=i;
			int j=0;
			while(k<ch1.length&&j<ch2.length&&ch1[k]==ch2[j])
			{
				k++;
				j++;
				if(j==ch2.length)
				{
					return true;
				}

			}

			i++;
		}


		return false;
	}


	 */

	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String words[]=str.split(" ");
		for (int i = 0; i < words.length; i++) 
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[j].compareTo(words[i])<-1)
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		System.out.println();
		str="";
		for (int j = 0; j < words.length; j++) 
		{
			str=str+words[j]+ " ";
			
		}
		System.out.print(str);
	}*/ 
	/*public static void main(String[] args) 
	{
		int arr[]= {1,3,2,8,5,4,6,90,87,65,8};
		for (int i = 1; i < arr.length; i++) 
		{
			for (int j = i; j < arr.length; j++) 
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}
	*/
	
}
