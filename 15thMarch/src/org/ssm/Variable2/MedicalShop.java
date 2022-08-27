package org.ssm.Variable2;

public class MedicalShop 
{
	void sell(Prescription p,Money m)
	{
		System.out.println("Your Medicine is ready");
	}
	public static void main(String[] args) 
	{
		MedicalShop ms=new MedicalShop();
		//this is the first step
		//ms.sell(new Prescription(),new Money());
		Money m=new Money();
		Prescription p=new Prescription();
		ms.sell(p, m);
	}
	

}
