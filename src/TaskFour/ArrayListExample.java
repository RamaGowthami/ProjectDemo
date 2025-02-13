//program for collection classes->ArrayList-->LIST Interface
package TaskFour;
import java.util.*;
public class ArrayListExample 
{

	public static void main(String[] args) 
	{
	  ArrayList<Integer> Alist=new ArrayList<>();//List is interface for ArrayList
	  Alist.add(10);
	  Alist.add(20);
	  Alist.add(30);
	  Alist.add(40);
	  Alist.add(50);
	  Alist.add(60);
	  System.out.println("ArrayList:" +Alist);
	  Alist.remove(2);//removes according to index.
	  if(Alist.contains(40)) 
	  {
		  System.out.println("It contains 40");  
	  }
	  else 
	  {
		  System.out.println("Not contains 40");
	  }
	  
	  System.out.println("ArrayList:" +Alist);
	  Alist.add(60);
	  System.out.println("ArrayList:" +Alist);//it allow duplicates

	}

}
//output:
/*ArrayList:[10, 20, 30, 40, 50, 60]
It contains 40
ArrayList:[10, 20, 40, 50, 60]
ArrayList:[10, 20, 40, 50, 60, 60]*/