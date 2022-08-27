package org.ssm.MyOwnsorting;

public class Employee 
{
	int id;

	public Employee(int id) 
	{

		this.id = id;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + "]";
	}
	public int compareToo(Object obj)

	{

		int id1=this.id;
		Employee e2=(Employee) obj;
		int id2=e2.id;

		if(id1<id2)
		{
			return -1;
		}
		else if(id1>id2)
		{
			return 1;

		}
		else 
			return 0;



	}


}
