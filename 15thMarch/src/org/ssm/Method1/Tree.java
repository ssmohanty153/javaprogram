package org.ssm.Method1;

public class Tree 
{
Oxigen give()
{
	Oxigen o= new Oxigen();
	System.out.println("Tree gives oxigen");
	return o;
}
public static void main(String[] args) 
{
	Tree t=new Tree();
	Oxigen o=t.give();
	
}
}
