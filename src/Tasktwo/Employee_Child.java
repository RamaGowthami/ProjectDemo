/*
create a subclass employee that inherits from Person and adds attribute like EmployeeID and salary.
use the super keyword to initialize the person attributes in the employee constructor.
*/
package Tasktwo;

public class Employee_Child extends Parent_Person
{
      int employee_id;double salary;
	public Employee_Child(String name,int age,int employee_id,double salary) 
	{
		super(name,age);//calling the parent class constructor.
		this.employee_id=employee_id;
		this.salary=salary;
		
	}
	//method to display employee info
	public void displayEmployee_Info() 
	{
		display();//calling method from person class.
		System.out.println("Employee Id"+this.employee_id);
		System.out.println("Employee salary"+this.salary);
	}

	public static void main(String[] args) 
	{
		Employee_Child EC=new Employee_Child("rama",32,101,20000);
		EC.displayEmployee_Info();

	}

}
//output:
/*person name is rama  person age is32
Employee Id101
Employee salary20000.0
*/