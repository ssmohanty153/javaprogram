package org.ssm.listIterater;

import java.util.*;

public class ListIterater 
{
public static void main(String[] args) 
{
	LinkedList l=new LinkedList<>();
	l.add("hari");
	l.add("rama");
	l.add("muna");
	l.add("ssm");
	l.add("krishna");
System.out.println(l);
ListIterator ltr=l.listIterator();
while(ltr.hasNext())
{
	String str=(String) ltr.next();
	if(str.equals("hari"))
	{
		ltr.set("hareKrishna");
	}
	
	
}
System.out.println(l);

	
}
}
