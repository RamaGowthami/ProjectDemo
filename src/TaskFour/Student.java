
/*Create a class Student to represent Student Information,To handle exception
 1.class Student with attributes roll_no,name,age and course,initialize values through parameterized constructor.
 2.if the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException"
 3.if a Name contains numbers or special symbols raise Exception "NameNotValidException".Define two Exception classes.*/

package TaskFour;
import java.util.*;

public class Student 
{
private int roll_number;
private int age;
private String name;
private String course;
public Student(int roll_number, int age, String name, String course) throws AgeNotWithinRangeException,NameNotValiException
{
	if((age<15 || age>21)) 
	{
	    
		throw new AgeNotWithinRangeException("Age must be between 15 and 21");
		
	}
	if(!name.matches("[A-Za-z]+")) 
	{
		throw new NameNotValiException("name should not contain numbers or special symbols");
	}
	this.roll_number = roll_number;
	this.age = age;
	this.name = name;
	this.course = course;
}
public void DisplayStudent() 
{
System.out.println("Student Details:");
System.out.println("roll_number"  +" "+roll_number);
System.out.println("age"  +" "+age);
System.out.println("name" +" "+name);
System.out.println("course" +" "+course);
}
public static void main(String[] args) 
{

	
	    
	        Scanner sc = new Scanner(System.in);

	        try 
	        {
	            System.out.print("Enter Roll No: ");
	            int roll_no = sc.nextInt();
	            sc.nextLine();  // Consume newline

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Age: ");
	            int age = sc.nextInt();
	            sc.nextLine();  // Consume newline

	            System.out.print("Enter Course: ");
	            String course = sc.nextLine();

	            Student s1 = new Student(roll_no,age,name, course);
	            s1.DisplayStudent();
	        } 
	        catch (AgeNotWithinRangeException | NameNotValiException e) 
	        {
	            System.out.println("Exception: " + e.getMessage());
	        } 
	        finally 
	        {
	            sc.close();
	        }
	    }
}
//output:
/*Enter Roll No: 101
Enter Name: Rama
Enter Age: 25
Enter Course: Computers
Exception: Age must be between 15 and 21
*/
/*Enter Roll No: 102
Enter Name: Gowth@mi
Enter Age: 18
Enter Course: Computers
Exception: name should not contain numbers or special symbols
*/
/*Enter Roll No: 103
Enter Name: RamaGowthami
Enter Age: 18
Enter Course: Computers
Student Details:
roll_number 103
age 18
name RamaGowthami
course Computers*/
/*Enter Roll No: 124
Enter Name: 9digit
Enter Age: 21
Enter Course: Computers
Exception: name should not contain numbers or special symbols*/
