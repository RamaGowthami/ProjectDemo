package TaskThree;
import java.util.*;

public class DriverMain {

	public static void main(String[] args) 
	{
		    while(true) 
		    {
			System.out.println("1.enter employee details");
			System.out.println("2.enter product details");
			System.out.println("3.both");
			System.out.println("4.exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter u r choice");
			int ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
					System.out.println("enter employee Id");
					int empId=sc.nextInt();
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter salary");
					double salary=sc.nextDouble();
					Employee emp=new Employee(empId,name,salary);
					emp.display();
					break;
			case 2:
					System.out.println("enter pid");
	        		int pid=sc.nextInt();
	        		System.out.println("enter price");
	        		double price=sc.nextDouble();
	        		System.out.println("quantity");
	        		int quantity=sc.nextInt();
	        		Product pro=new Product(pid,price,quantity);
	        		pro.display();
	        		break;
			case 3:
				System.out.println("enter employee details");
		        System.out.println("enter employee Id");
		        int empId1=sc.nextInt();
		        System.out.println("enter name");
		        String name1=sc.next();
		        System.out.println("enter salary");
		        double salary1=sc.nextDouble();
		        Employee emp1=new Employee(empId1,name1,salary1);
		        emp1.display();
		        System.out.println("enter product details");
		        System.out.println("enter pid");
		        int pid1=sc.nextInt();
		        System.out.println("enter price");
		        double price1=sc.nextDouble();
		        System.out.println("quantity");
		        int quantity1=sc.nextInt();
		        Product pro1=new Product(pid1,price1,quantity1);
		        pro1.display();
		        break;
			case 4:
                System.out.println("Thank you");
				System.exit(0);
				break;
			default:
				System.out.println("Have a good day!");
				break;
				
			}
			
		
	}

}
}
/*1.enter employee details
2.enter product details
3.both
4.exit
enter u r choice
1
enter employee Id
101
enter name
rama
enter salary
25000
Employee ID: 101
Name: rama
Monthly Salary: 25000.0
Yearly Income Tax: 31500.0
1.enter employee details
2.enter product details
3.both
4.exit
enter u r choice
2
enter pid
123
enter price
345
quantity
23
Product ID: 123
Unit Price: 345.0
Quantity: 23
Sales Tax per Unit: 24.150000000000002
1.enter employee details
2.enter product details
3.both
4.exit
enter u r choice
3
enter employee details
enter employee Id
123
enter name
rama
enter salary
25000
Employee ID: 123
Name: rama
Monthly Salary: 25000.0
Yearly Income Tax: 31500.0
enter product details
enter pid
234
enter price
345
quantity
32
Product ID: 234
Unit Price: 345.0
Quantity: 32
Sales Tax per Unit: 24.150000000000002
1.enter employee details
2.enter product details
3.both
4.exit
enter u r choice
4
Thank you
*/
