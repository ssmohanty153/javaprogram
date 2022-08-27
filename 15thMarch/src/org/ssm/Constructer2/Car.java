package org.ssm.Constructer2;

public class Car 
{
String md1,color;
int price;
public Car() 
{
	md1="audi";
	color="black";
	price=1200000;
	
}
public static void main(String[] args) 
{
Car c1=new Car();
System.out.println(c1.md1+""+c1.color+""+c1.price);
}
}
