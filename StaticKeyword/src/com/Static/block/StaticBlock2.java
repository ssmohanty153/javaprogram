package com.Static.block;

public class StaticBlock2 {
	static int num=199;
	static String name;
	
	static{
		System.out.println("enter the number ls");
		num=166;
		name="sgxxhx;";
		
	}
static{
	System.out.println("entenbmr the number ls");
	num=16698;
	name="sgbmnxxhx;";
	
}
public static void main(String[] args) {
	System.out.println(num);
	System.out.println(name);
	
}
}
