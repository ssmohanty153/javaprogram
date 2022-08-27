package COM.SSM.SET;

public class Student 
{
int id;
String name;
double per;
public Student(int id, String name, double per) 
{
	//super();
	this.id = id;
	this.name = name;
	this.per = per;
}
@Override
public String toString() 
{
	return "[" + id + ", name=" + name + ", per=" + per + "]";
}
public int hashCode() 
{
	return id;
	//return name.hashCode();
	//return ((Double)per).hashCode();
}
public boolean equals(Object obj)
{
//	return false;
return this.hashCode()==obj.hashCode();
}


}
