//To create the class Employee with empId,name,salary and implement Taxable to caluculate incomeTax on yearly salary.
package TaskThree;

public class Employee implements Taxable
{
private int empId;
private String name;
private double salary;
public Employee(int empId, String name, double salary) 
{
	
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}
@Override
public double calcTax() 
{
	double yearly_salary=12*salary;
    return yearly_salary*IncomeTax;
}
public void display() {
    System.out.println("Employee ID: " + empId);
    System.out.println("Name: " + name);
    System.out.println("Monthly Salary: " + salary);
    System.out.println("Yearly Income Tax: " + calcTax());
}
}
