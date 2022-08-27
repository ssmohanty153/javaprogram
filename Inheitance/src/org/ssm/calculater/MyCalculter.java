package org.ssm.calculater;
	public class MyCalculter extends Calculater
	{
		void mul(int x,int y)
		{
			z=x*y;
			System.out.println("mul"+z);
		}
		public static void main(String[] args)
		{
			int x=20,y=30;
			MyCalculter m=new MyCalculter();
					m.mul(x, y);
			m.addition(x,y);
			m.substraction(x,y); 
		}
		
	}

 
