package com.ssm.Static;

public class VariableDemo {
	
	  static int count=1;
	   public void increment()
	   {
	       count++;
	       System.out.println(count);
	   }
	   public static void main(String args[])
	   {
	       VariableDemo obj1=new VariableDemo();
	       VariableDemo obj2=new VariableDemo();
	       VariableDemo obj3=new VariableDemo();
	       
	       obj1.increment();
	       obj2.increment();
	       obj3.increment();
	       
	       System.out.println("Obj1: count is="+obj1.count);
	       System.out.println("Obj2: count is="+obj2.count);
	   }
	}


