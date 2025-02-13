/*To Create a class Voter with voterId,name,age with parameterized constructor.The parameterized constructor should throw a check/unchecked exception
 -> if age<18 the message Exception is Invalid age for voter*/


package TaskFour;

public class Voter {

	private int voterId;private String name;private int age;
	
	
	public Voter(int voterId, String name, int age) throws CustomInvaliAgeException 
	{
		
		if(age<18) 
		{
			throw new CustomInvaliAgeException("Invalid Age for Voter");
		}
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
public void display() 
{
	System.out.println("voterId:"+" "+voterId+" "+"Name:"+" "+name+" "+"age:"+" "+age);
}

	public static void main(String[] args) 
	{
		
		try
		{
			Voter v1=new Voter(102,"radha",18);
			v1.display();
			Voter v2=new Voter(101,"rama",17);
			v2.display();
			//Voter v3=new Voter(102,"radha",18);
			//v3.display();
		}
		catch(CustomInvaliAgeException e)
		{
			e.printStackTrace();
		   System.out.println("Exception: " + e.getMessage());
		}

	}

}
//output:
/*voterId: 102 Name: radha age: 18
TaskFour.CustomInvaliAgeException: Invalid Age for Voter
	at ProjectDemo/TaskFour.Voter.<init>(Voter.java:17)
	at ProjectDemo/TaskFour.Voter.main(Voter.java:35)
Exception: Invalid Age for Voter

*/