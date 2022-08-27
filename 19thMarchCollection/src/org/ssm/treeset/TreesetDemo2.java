package org.ssm.treeset;

import java.util.*;

public class TreesetDemo2 
{
public static void main(String[] args) 
{
	TreeSet ts=new TreeSet(new Mycomputer());
	ts.add("raja");
	ts.add("Raju Kumar");
	ts.add("Hare krishna");
	ts.add("raja mama");
	System.out.println(ts);
	
	
}
}
