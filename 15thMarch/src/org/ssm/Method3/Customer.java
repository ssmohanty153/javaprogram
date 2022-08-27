package org.ssm.Method3;

public class Customer 
{
	void perchase()
	{
		Money m=new Money();
		Prescripation p= new Prescripation();
		MedicineShop ms=new MedicineShop();
		Medicine md=ms.sell(m, p);
		
	System.out.println("Custemer collect the medicine");
	}
	public static void main(String[] args)
	{
		Customer c=new Customer();
		c.perchase();
	}

}
