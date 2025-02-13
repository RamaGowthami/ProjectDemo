package TaskFour;
import java.util.*;

public class LinkedHashSetExample 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		//Display the set maintains insertion order
		System.out.println("LinkedHashSet:" +set);
		set.add(50);//does not allow duplicates
		System.out.println("LinkedHashSet:" +set);
		//removing an element
		set.remove(10);
		System.out.println("After removing LinkedHashSet:" +set);
		//checking if an element exists
		System.out.println("contains 20 LinkedHashSet:" +set.contains(20));
		//iterating using for-each loop
		for(Integer num:set) 
		{
			System.out.println(num+" ");
		}
		//Getting the size of the set
		System.out.println("LinkedHashSet size:" +set.size());
		//clearing all elements
		set.clear();
		System.out.println("LinkedHashSet:" +set);

	}

}
//output:
/*LinkedHashSet:[10, 20, 30, 40, 50]
LinkedHashSet:[10, 20, 30, 40, 50]
After removing LinkedHashSet:[20, 30, 40, 50]
contains 20 LinkedHashSet:true
20 
30 
40 
50 
LinkedHashSet size:4
LinkedHashSet:[]
*/
