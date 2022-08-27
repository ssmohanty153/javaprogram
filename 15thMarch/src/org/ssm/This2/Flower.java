package org.ssm.This2;

public class Flower 
{
String type,color;
public Flower(String type,String color)
{
	this.type=type;
	this.color=color;
	
}
public static void main(String[] args) 
{
Flower f=new Flower("lotous", "black");
System.out.println(f.type+"  "+f.color);
}
}
