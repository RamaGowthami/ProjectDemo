/*To write a program for HashMap by Taking Key as names(Strings) and values are Integers,and perform addition,remove,display of Students by grades.*/
package TaskFour;
import java.util.*;

public class HashMapExample 
{
       //created HashMap for Strings and Integers.
		HashMap<String,Integer> StudentGrades=new HashMap<String,Integer>();
		//method to add Students
		public void addStudents(String name,int grade) 
		{
			StudentGrades.put(name, grade);
			System.out.println(name+" "+"added with grade"+" "+grade);
		}
		//method to remove a student
		public void removeStudent(String name) 
		{
			if(StudentGrades.containsKey(name)) 
			{
				StudentGrades.remove(name);
				System.out.println(name+" "+"removed from the list");
			}
			else 
			{
				System.out.println(name+"not found in the list");
			}
		}
		//method to display all Students and their grades
		public void displayStudents() 
		{
			if(StudentGrades.isEmpty()) 
			{
				System.out.println("No students in the list");
			}
			else 
			{
				System.out.println("\nStudent Grades:");
				for(Map.Entry<String,Integer>entry:StudentGrades.entrySet()) 
				{
				System.out.println(entry.getKey()+":"+entry.getValue());	
				}
			}
		}
		
		public static void main(String[] args) 
		{
			HashMapExample hm=new HashMapExample();
			hm.addStudents("rama",20);
			hm.addStudents("Gowthami",25);
			hm.addStudents("Radha",31);
			hm.addStudents("rani", 24);
			
		
		//Displaying Students
		hm.displayStudents();
		//removing students
		hm.removeStudent("Bob");
		hm.removeStudent("rani");
		//Display updated list
		hm.displayStudents();
	
		}	
		
}
//output:
/*rama added with grade 20
Gowthami added with grade 25
Radha added with grade 31
rani added with grade 24

Student Grades:
Gowthami:25
rama:20
Radha:31
rani:24
Bobnot found in the list
rani removed from the list

Student Grades:
Gowthami:25
rama:20
Radha:31
*/

