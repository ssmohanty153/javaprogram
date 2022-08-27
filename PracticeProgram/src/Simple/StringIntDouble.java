package Simple;

import java.util.*;;

public class StringIntDouble 
{
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter ur value");
	        String i=scan.next();
	        String s=scan.next();
	        String d=scan.next();
	       
	        try
	        {
	        	Integer.parseInt(i);
	        	System.out.println("int : "+i);
	        }
	        catch (Exception e)
	        {
	        	try
	        	{
	        	Double.parseDouble(i);
				System.out.println("double : "+i);
	        	}
	        	catch (Exception e1)
	        	{
	        		System.out.println("String : "+i);
				}
			}
	        try
	        {
	        	Integer.parseInt(s);
	        	System.out.println("int : "+s);
	        }
	        catch (Exception e)
	        {
	        	try
	        	{
	        	Double.parseDouble(i);
				System.out.println("double : "+s);
	        	}
	        	catch (Exception e1)
	        	{
	        		System.out.println("String : "+s);
				}
			}
	        try
	        {
	        	Integer.parseInt(d);
	        	System.out.println("int : "+d);
	        }
	        catch (Exception e)
	        {
	        	try
	        	{
	        	Double.parseDouble(d);
				System.out.println("double : "+d);
	        	}
	        	catch (Exception e1)
	        	{
	        		System.out.println("String : "+d);
				}
			}
	        
	        
	    }

}
