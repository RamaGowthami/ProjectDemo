/* create a class product(pid,price,quantity) with parameterized constructor.*/
package Tasktwo;

public class Product {
	int pid;double price;int quantity;
   
	public Product(int pid,double price,int quantity) 
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}

	public void display() {
		// Display product details
	    
	        System.out.println("Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity);
	    
		
	}

	

}
