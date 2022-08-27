package org.ssm.MyOwnsorting;

import java.util.*;

public class ComComDemo 
{
public static void main(String[] args) 
{
	TreeSet t1=new TreeSet();
	t1.add(10);
	t1.add(200);
	t1.add(744);
	t1.add(400);
	System.out.println(t1);
	
	
	
	
	System.out.println("--------------");
	TreeSet t2=new TreeSet(new MyComparator());
	t2.add(10);
	t2.add(200);
	t2.add(744);
	t2.add(400);
	System.out.println(t2);
	
	

}
}
