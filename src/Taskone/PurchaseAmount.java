package Taskone;
import java.util.Scanner;

public class PurchaseAmount {

	public static void main(String[] args) 
	{
	Scanner Sc=new Scanner(System.in);
	double purchaseAmount=Sc.nextDouble();
	Double discount=0.0;
	//if purchaseAmount<500 ,no discount applied
	//if purchaseAmount->500-1000,a 10% discount is applied
    //if purchaseAmount>1000,a 20% discount is applied
	if(purchaseAmount>1000) 
	{
		 discount=purchaseAmount*0.20;
		purchaseAmount-=discount;
		System.out.println("a 20% discount is applied"+purchaseAmount);	
	}
	else if(purchaseAmount>=500&&purchaseAmount<=1000)
	{
		discount=purchaseAmount*0.10;
		purchaseAmount-=discount;
		System.out.println("a 10% discount is applied"+purchaseAmount);
	}
	else {
		System.out.println("no discount applied");
	}
	//System.out.println("Discount Applies:"+discount);
	//System.out.println("purchaseAmount:"+purchaseAmount);
	}

}
