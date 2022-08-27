package com.ssm.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class MyFirstClass
{
public static void main(String[] args) 
{
HashMap hm=new HashMap();	
hm.put(23, "apple");
hm.put(45, "banana");
hm.put(45, "orange");
hm.put('g', "goa");
hm.put(null, "watermillan");
hm.put(212, "pineapple");
hm.put(283, "apple");
System.out.println(hm);
Set keys=hm.keySet();
System.out.println(keys);
Collection values=hm.values();
System.out.println(values);
System.out.println("--------------------");
System.out.println(hm.get(23));
System.out.println(hm.containsKey(45));
System.out.println(hm.containsValue("tiger"));
for(Object obj:keys)
{
	System.out.println(obj+"==>"+hm.get(obj));
}
}


}
