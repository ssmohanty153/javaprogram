package org.ssm.collection;

import java.util.*;
import java.util.*;

public class AlcopyDemo 
{
public static void main(String[] args) 
{
	HashSet<String> set=new HashSet<String>();
	set.add("ajit");
	set.add("Krishna");
	set.add("hari");
	set.add("muna");
	set.add("little");
	ArrayList<String> ar=new ArrayList<String>(set);
	System.out.println(ar);
}
}
