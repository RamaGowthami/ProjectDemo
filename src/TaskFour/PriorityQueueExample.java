//program on collection ->class->priorityQueue->QueueInterface
package TaskFour;
import java.util.*;
public class PriorityQueueExample 
{

public static void main(String[] args) 
{
		
	 PriorityQueue<Integer> pq=new PriorityQueue<>();
	 pq.add(30);
	 pq.add(10);
	 pq.add(20);
	 System.out.println("Priority Queue:"+pq);
	 System.out.println("Polling (removing smallest):"+pq.poll());
	 System.out.println("After poll:"+pq);
	 pq.remove(20);
	 System.out.println("After remove:"+pq);
	 pq.add(30);//Allow duplicates
	 pq.add(25);
	 pq.add(3);
	 System.out.println("Priority Queue:"+pq);
	 System.out.println("Highest Priority Element(head):" +pq.peek());
	 System.out.println("Polling (removing smallest):"+pq.poll());
	 
}
}	

//Output:
/*Priority Queue:[10, 30, 20]
Polling (removing smallest):10
After poll:[20, 30]
After remove:[30]
Priority Queue:[3, 25, 30, 30]
Highest Priority Element(head):3
Polling (removing smallest):3*/