//To create a program for collections-> class ArrayDeque->Deque Interface->Queue.
package TaskFour;
import java.util.*;
public class ArrayDequeExample 
{

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> deque=new ArrayDeque<>();
		//Adding elements
		deque.add(10);
		deque.add(20);
		deque.add(30);
        System.out.println("ArrayDeque:"+deque);
        //Adding elements at both ends
        deque.addFirst(100);
        deque.addLast(200);
        deque.offerFirst(50);
        deque.offerLast(300);
        System.out.println("ArrayDeque:"+deque);
        //removing elements from both ends
        deque.add(50);
        deque.add(60);
        System.out.println("ArrayDeque:"+deque);
        System.out.println("First Element:"+deque.getFirst());
        System.out.println("First Element:"+deque.getLast());
        System.out.println("ArrayDeque:"+deque.peekFirst());
        System.out.println("ArrayDeque:"+deque.peekLast());
        System.out.println("ArrayDeque:"+deque);
		deque.remove(50);
		System.out.println("ArrayDeque:"+deque);
		 
     }

}
//output:
/*ArrayDeque:[10, 20, 30]
ArrayDeque:[50, 100, 10, 20, 30, 200, 300]
ArrayDeque:[50, 100, 10, 20, 30, 200, 300, 50, 60]
First Element:50
First Element:60
ArrayDeque:50
ArrayDeque:60
ArrayDeque:[50, 100, 10, 20, 30, 200, 300, 50, 60]
ArrayDeque:[100, 10, 20, 30, 200, 300, 50, 60]
*/
