package com.Static.Variable;

public class StatiucVariable2 {
	static int num;
	String name;
	public static void main(String[] args) {
		StatiucVariable2 obj1=new StatiucVariable2();
		StatiucVariable2 obj2=new StatiucVariable2();
		obj1.num=170;
		obj1.name="ojd";
		
		obj2.num=170;
		obj2.name="ojhjjgjd";

		System.out.println(obj1.num);
		System.out.println(obj1.name);
		System.out.println(obj2.num);
		System.out.println(obj2.name);
		
		
	}

}
