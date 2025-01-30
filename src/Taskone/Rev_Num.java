package Taskone;
import java.util.Scanner;

public class Rev_Num {

	public static void main(String[] args) 
	{
	Scanner Sc=new Scanner(System.in);
	int num=Sc.nextInt();
	System.out.println("Input:"+num);
	int num_Rev=0;
	while(num!=0) 
	{
	int digit=num%10;//(Extract the last digit)
	num_Rev=num_Rev*10+digit;//(Add the digit to the reverse number)
	num/=10;//remove the last digit from original number
	
	};
	System.out.println("Output:"+num_Rev);
	
	

	}

}
