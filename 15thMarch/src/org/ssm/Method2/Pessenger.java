package org.ssm.Method2;

public class Pessenger 
{
	void collect()
	{
		Conducter c=new Conducter();
		Money m= new Money();
		Ticket t=c.give(m);
		System.out.println("Pessenger the collect the ticket");
	
		
	}
		public static void main(String[] args) 
		{
			Pessenger p= new Pessenger();
			p.collect();
		}
	}
