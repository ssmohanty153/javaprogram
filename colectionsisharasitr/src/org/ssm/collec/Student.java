package org.ssm.collec;

public class Student 
{
String name;
double per;
public Student(String name, double per) {
	super();
	this.name = name;
	this.per = per;
}
@Override
public String toString() {
	return "Student [name=" + name + ", per=" + per + "]";
}
}
