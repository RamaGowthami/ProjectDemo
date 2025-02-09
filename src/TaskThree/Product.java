package TaskThree;


	public class Product implements Taxable {
	    private int pid;
	    private double price;
	    private int quantity;

	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    @Override
	    public double calcTax() {
	        return price * salesTax; // Sales tax on unit price
	    }

	    public void display() {
	        System.out.println("Product ID: " + pid);
	        System.out.println("Unit Price: " + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Sales Tax per Unit: " + calcTax());
	    }

}
