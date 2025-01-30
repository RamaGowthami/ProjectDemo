/*5 5 5 5 5
 * 5 4 4 4 4
 * 5 4 3 3 3
 * 5 4 3 2 2
 * 5 4 3 2 1 by using i,j,k*/


package Taskone;

public class Decreasing_numbers_Loop {

	public static void main(String[] args)
	{
	
       int n=5;
       for(int i=0;i<n;i++) 
       {
    	for(int j=0;j<=i;j++) 
    	{
    		System.out.print((n-j)+" ");    	
    	}
    	for(int k=i+1;k<n;k++) 
    	{
    		System.out.print((n-i) +" ");
    		
    	}
    	System.out.println(" ");
       }
	}

}
