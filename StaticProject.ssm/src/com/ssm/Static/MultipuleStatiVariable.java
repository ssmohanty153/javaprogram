package com.ssm.Static;

public class MultipuleStatiVariable {
	static int car=77;
	static String s;
	
		public static void main(String[] args) {
		MultipuleStatiVariable m1=new MultipuleStatiVariable();
		MultipuleStatiVariable m2=new MultipuleStatiVariable();
		m1.car=56;
		m1.s="jsbjskjs";
		m2.car=9890;
		m2.s="hgdjg";
		System.out.println(m1.car);
		System.out.println(m2.car);
		System.out.println(m1.s);
		System.out.println(m2.s);
		
		
	}

}
