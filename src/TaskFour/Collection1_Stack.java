//To create Stack methods for pushing elements into the stack and poping elements into the stack.
package TaskFour;

import java.util.Stack;

public class Collection1_Stack 
{
	public static void main(String[] args) 
	{
	Stack<Integer> st=new Stack<Integer>();
	//checks if the stack is empty or not?
	if(st.isEmpty()) 
	{
		//pushing the elements into stack if stack is Empty.
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(50);
	System.out.println("Stack after pushing elements: " + st);
	//to show the top element of the stack use peek()
	System.out.println("Top element (peek):"+st.peek());
	System.out.println("Is stack empty? " + st.isEmpty());
	}
	//to check for stack isEmpty().
	if(!(st.isEmpty()))
	{
		//to pop the elements in the stack.
		System.out.println("Popped element: "+st.pop());
		System.out.println("Popped element: "+st.pop());
		System.out.println("Stack after pop elements: " + st);
		
	
	}
	// Print the final stack after popping
    System.out.println("Final stack: " + st);
	
	}
//output:
/*Stack after pushing elements: [10, 20, 30, 40, 50]
Top element (peek):50
Is stack empty? false
Popped element: 50
Popped element: 40
Stack after pop elements: [10, 20, 30]
Final stack: [10, 20, 30]
*/
	
}