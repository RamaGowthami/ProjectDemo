package Taskone;
import java.util.*;
public class Num_Neg_Pos 
{
	public static void main(String args[]) 
	{
		boolean isPositive=false;boolean isNegative=false;
		
        while(true) 
        {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Input="+num);  
        if((num>0)&&(!isPositive)) {
    	System.out.println("Output=Positive");  
    	isPositive=true;
    	//System.out.print(" ");
        }
       else if((num<0)&&(!isNegative))
       {
    	   System.out.println("Output=Negative");
    	   isNegative=true;
       }
       if(isPositive&&isNegative==true) 
       {
    	   break;
       }
     }
}
}