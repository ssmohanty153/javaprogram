import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PassWordVAlidation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Pattern p=Pattern.compile("((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]).{8,15})");
		Matcher m=p.matcher(str);
		if(m.find())
		{
			System.out.println("correct password");
		}
		else
		{
			System.out.println("Password Not Correct");
		}
	}
}
