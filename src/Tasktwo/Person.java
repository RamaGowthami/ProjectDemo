/*create a class with properties
a.Default age of person should be 18.
b.A person object can be initialized with name and age.
c.Method to display name and age of person.
*/
package Tasktwo;

public class Person {
	int age;String name;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Person() {
		System.out.println("Default age of person should be 18");
	}
	//method to display name and age of person.
	void display() {
		System.out.println("name"+" "+this.name+" "+"and age"+" "+this.age+" "+"of person");
	}

	public static void main(String[] args) 
	{
     int age=18;
     Person persondef=new Person();//a default constructor is called to print default age.
     Person person=new Person("rama",31);//A person object can be initialized with name and age.
     Person person1=new Person("gowthami",32);//A person1 object can be initialized with name and age. 
     person.display();
     person1.display();
    }

}
/*Default age of person should be 18
name rama and age 31 of person
name gowthami and age 32 of person
*/