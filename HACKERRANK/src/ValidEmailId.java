import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidEmailId 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//valid for all email id;
		//Pattern p=Pattern.compile("[0-9a-zA-Z][a-zA-Z0-9_.]*@[0-9a-zA-Z]+([.][a-zA-Z]+)+");
		
		//valid for only gmail id
		Pattern p=Pattern.compile("[0-9a-zA-Z][a-zA-Z0-9_.]*@gmail[.]com");
		Matcher m=p.matcher(str);
		if(m.find()&&m.group().equals(str))
		{
			System.out.println("valid email id");
		}
		else
		{
			System.out.println("not valid email id");
		}
		sc.close();
	}
}
