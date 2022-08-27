import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormVAlidation 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(str);
		if(m.find()&&m.group().equals(str))
		{
			System.out.println("valid mobile no");
		}
		else
		{
			System.out.println("not valid mobile no");
		}
		sc.close();

	}
}
