package Tasktwo;
import java.util.Scanner;

public class ProductChild {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 5 product Information from user and store");
		System.out.println("Enter product id,product price,product quantity");
		Product[] products=new Product[5];
		//Accept 5 product details from the user.
		for(int i=0;i<5;i++) {
			System.out.println("Enter details for product" +(i+1)+":");
			System.out.println("Product Id");
			int pid=Sc.nextInt();
			System.out.println("Product Price");
			double price=Sc.nextDouble();
			System.out.println("Product quantity");
			int quantity=Sc.nextInt();
			products[i]=new Product(pid, price, quantity);
			
			
		}
		 // Find the product with the highest price
        int highestPricePid = products[0].pid;  // Assume first product has highest price
        double highestPrice = products[0].price;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > highestPrice) {
                highestPrice = products[i].price;
                highestPricePid = products[i].pid;
            }
        }

		// Display all product details
        System.out.println("\nProduct Details:");
        for (Product product : products) {
            product.display();//here we're calling method from Product class,by using default access modifier it is called automatically.
        }
     // Display the PID of the product with the highest price
        System.out.println("\nProduct with the highest price:");
        System.out.println("Product ID: " + highestPricePid + ", Price: " + highestPrice);

        Sc.close();
        // Calculate and display total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("\nTotal amount spent on all products: " + totalAmount);
        }
        // Method to calculate total amount spent on all products
        public static double calculateTotalAmount(Product[] products) {
            double total = 0;
            for (Product product : products) {
                total += product.price * product.quantity;
            }
            return total;
}
}
//output:
/*Enter 5 product Information from user and store
Enter product id,product price,product quantity
Enter details for product1:
Product Id
1
Product Price
10
Product quantity
3
Enter details for product2:
Product Id
2
Product Price
20
Product quantity
3
Enter details for product3:
Product Id
3
Product Price
30
Product quantity
2
Enter details for product4:
Product Id
4
Product Price
20
Product quantity
3
Enter details for product5:
Product Id
5
Product Price
34
Product quantity
5

Product Details:
Product ID: 1, Price: 10.0, Quantity: 3
Product ID: 2, Price: 20.0, Quantity: 3
Product ID: 3, Price: 30.0, Quantity: 2
Product ID: 4, Price: 20.0, Quantity: 3
Product ID: 5, Price: 34.0, Quantity: 5

Product with the highest price:
Product ID: 5, Price: 34.0

Total amount spent on all products: 380.0
*/
