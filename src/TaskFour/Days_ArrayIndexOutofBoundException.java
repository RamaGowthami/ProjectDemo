//To create a program for Accepting Index for Days from User and print DayName According to user index starting from sunday as 0 index and handle Array Index out of bound Exception*/
package TaskFour;
import java.util.*;
public class Days_ArrayIndexOutofBoundException 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String days[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"}; 
		
		try 
		{
		System.out.println("enter the index for the day of the week between (0-6)");	
		int day=sc.nextInt();
		
		System.out.println("The day at index "+" "+day+" "+"is:"+" "+days[day]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			//System.out.println("Error:Array IndexOutOfBoundException!Please enter a number between 0 and 6.");
		    System.out.println("Exception Message: " + e.getMessage());
		     //e.printStackTrace();
		}
		finally {
			sc.close();
		}

	}

}
//output:
/*enter the index for the day of the week between (0-6)
6
The day at index  6 is: Saturday
enter the index for the day of the week between (0-6)
0
The day at index  0 is: Sunday
enter the index for the day of the week between (0-6)
8
Exception Message: Index 8 out of bounds for length 7
*/