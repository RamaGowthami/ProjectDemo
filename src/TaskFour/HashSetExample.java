//To create a program for class-Hashset--->Set Interface.
package TaskFour;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println("Hashset:"+set);//insertion order is not maintained
		set.add(30);
		System.out.println("Hashset:"+set);//does not allow duplicates.
		set.remove(20);
		System.out.println("Hashset:"+set);
		System.out.println("Hashset:"+set.contains(10));
		System.out.println("Iterating by using for-each loop"+" ");
		for(Integer num:set) {
			System.out.println(num);
		}
		set.clear();
		if(set.isEmpty()) 
		{
			System.out.println("Hashset:"+set+"set is Empty");	
		}
		else 
		{
			System.out.println("Hashset:"+set+"set is Not Empty");		
		}
		    System.out.println("Hashset:"+set);

	}

}
//output:
/*Hashset:[20, 10, 30]
Hashset:[20, 10, 30]
Hashset:[10, 30]
Hashset:true
Iterating by using for-each loop 
10
30
Hashset:[]set is Empty
Hashset:[]
*/
