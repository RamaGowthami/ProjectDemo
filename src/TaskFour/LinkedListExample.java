//program to write Collection Classes-LinkedList-->List Interface.
package TaskFour;
import java.util.*;

public class LinkedListExample 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> numbers=new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.addFirst(5);//Add at Begining.
		numbers.addLast(50);//Add at Last
		System.out.println("Linked List:"+numbers);
		numbers.addFirst(5);
		numbers.addLast(50);
		System.out.println("Linked List:"+numbers);//it allows duplication.
		numbers.remove(5);
		System.out.println("Linked List:"+numbers);//removes according to Index
		if(numbers.contains(5)) 
		{
			System.out.println("Contains 5");
		}
		else 
		{
			System.out.println("not Contains 5");
		}
		numbers.addFirst(55);
		Collections.sort(numbers);
		System.out.println("Linked List:"+numbers);//sortedList is printed.
	}

}
//output:
/*Linked List:[5, 10, 20, 50]
Linked List:[5, 5, 10, 20, 50, 50]
Linked List:[5, 5, 10, 20, 50]
Contains 5
Linked List:[5, 5, 10, 20, 50, 55]*/
