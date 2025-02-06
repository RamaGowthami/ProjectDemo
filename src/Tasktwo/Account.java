/*program to create a class Account with data member balance*/

package Tasktwo;
import java.util.Scanner;
public class Account {
    double balance;
    //default constructor
    public Account() 
    {
    System.out.println("Hi,Thankyou for using my ATM");
    balance=0;
    }
    //parameterized constructor
    public Account(double deposit) 
    {
		System.out.println("Depositing Amount"+deposit);
		balance+=deposit;
		display();
	}
    //method to deposit the amount to the account
    public void deposit(double amount) 
    {
    if(amount>0) 
    {
    	balance+=amount;
    	System.out.println("deposited amount"+amount);
    	display();
    }
    else 
    {
    	System.out.println("Invalid deposit amount");
    }
    }
    //method to withdraw amount from account.
    public void withDraw() 
    {
    	System.out.println("Please enter how much Amount u want to withdraw");
    	Scanner Sc=new Scanner(System.in);
    	Double WithDraw_Amount=Sc.nextDouble();
    	if(WithDraw_Amount<0) 
    	{
    		System.out.println("error!please enter positive number");
    	}
    	else if(WithDraw_Amount>balance) 
    	{
    		
    		System.out.println("Insufficient Balence to u r WithDraw_Amount u r balence is "+balance);
    	}
    	else 
    	{
    	balance-=WithDraw_Amount;
    	System.out.println("Withdrawal successful! Take your cash: " + WithDraw_Amount);
        }
    	display();
    	Sc.close();
    	}
    	
    public void display() 
    {
    	System.out.println("the current Balence is" +balance);	
    }
	public static void main(String[] args) 
	{
		Account account=new Account();
		Account account1=new Account(20000.00);
		account1.deposit(5000);
		account1.withDraw();
		//created other object for other user who want to deposit money. 
		//Account account2=new Account(20000.00);
		//account2.deposit(3000);
		
    }
}
//output:
/*Hi,Thankyou for using my ATM
Depositing Amount20000.0
the current Balence is20000.0
deposited amount5000.0
the current Balence is25000.0
Please enter how much Amount u want to withdraw
2000
Withdrawal successful! Take your cash: 2000.0
the current Balence is23000.0
*/
