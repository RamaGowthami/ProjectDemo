/*Define a base class person with attributes name and age.*/
package Tasktwo;

public class Parent_Person 
{
String name;int age;


public Parent_Person(String name, int age) 
{
	
	this.name = name;
	this.age = age;
}
public void display() 
{
System.out.println("person name is"+" "+this.name+" " +" "+"person age is"+this.age);	
}

}
