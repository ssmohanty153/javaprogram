package org.ssm.student;

import java.util.*;

public class ClassAllDemo 
{
public static void main(String[] args) 
{
List<String> ar1=new ArrayList<String>();
ar1.add("hare");
ar1.add("krishna");
ar1.add("muna");
ar1.add("babul");
ar1.add("little");
ar1.add(null);
ar1.add("hari");
System.out.println(ar1);
for (int i = 0; i < ar1.size(); i++) 
{
	String s=ar1.get(i);
	System.out.println(s);
}
System.out.println("---------------------------");

for(String s:ar1)
{
	System.out.println(s);
}
}
}
