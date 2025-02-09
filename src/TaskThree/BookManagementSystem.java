package TaskThree;
import java.util.*;

public class BookManagementSystem {

	public static void main(String[] args) {
		Library library=new Library();
		Scanner sc=new Scanner(System.in);
	
		while(true) 
		{
		System.out.println("\n welcome to library management system...");
		System.out.println("1.enter books details");
		System.out.println("2.add books");
		System.out.println("3.replace books");
		System.out.println("4.display all books");
		System.out.println("5.exit");
		System.out.println("enter choice from 1 to 5");
		int choice=sc.nextInt();//to provide choice for the user
		switch(choice)
		{
		case 1:
			// Allow user to enter multiple books
                   for (int i = 0; i < 5; i++) 
                   {
                       System.out.print("Enter book ID: ");
                       int bookID = sc.nextInt();

                       System.out.print("Enter book Title: ");
                       String title = sc.next();

                       System.out.print("Enter book Author: ");
                       String author = sc.next();

                       System.out.print("Is Available (true/false): ");
                       boolean isAvailable = sc.nextBoolean();

                       library.addBook(new Book(bookID, title, author, isAvailable));
                       
                   }
                   break;

			
		   
		case 2:
			
			  System.out.print("Enter book ID: ");
              int id = sc.nextInt();

              System.out.print("Enter book Title: ");
              String title = sc.next();

              System.out.print("Enter book Author: ");
              String author = sc.next();

              System.out.print("Is Available (true/false): ");
              boolean isAvailable = sc.nextBoolean();

              library.addBook(new Book(id, title, author, isAvailable));
              break;
			
			
		case 3:
			// Replace book details
            System.out.print("Enter book ID to replace: ");
            int bookID = sc.nextInt();
            library.replaceBook(bookID);
            break;
		 case 4:
             // Display all books
             library.displayBooks();
             break;	
			
		case 5:
			System.out.println("thank you!have a good day");
			System.exit(0);//out of the entire execution-jvm
			default:
				System.out.println("Invalid choice .please select a valid option");
				
			}
		}
	
			
			
			
		}
	}
/*
 welcome to library management system...
1.enter books details
2.add books
3.replace books
4.display all books
5.exit
enter choice from 1 to 5
1
Enter book ID: 101
Enter book Title: eas
Enter book Author: rfg
Is Available (true/false): true
Enter book ID: 2
Enter book Title: thg
Enter book Author: yhg
Is Available (true/false): true
Enter book ID: 3
Enter book Title: uhgf
Enter book Author: yhgf
Is Available (true/false): true
Enter book ID: 4
Enter book Title: ujhi
Enter book Author: ikmn
Is Available (true/false): true
Enter book ID: 5
Enter book Title: uht
Enter book Author: kjh
Is Available (true/false): true

 welcome to library management system...
1.enter books details
2.add books
3.replace books
4.display all books
5.exit
enter choice from 1 to 5
4
Book ID: 101, Title: eas, Author: rfg
Book ID: 2, Title: thg, Author: yhg
Book ID: 3, Title: uhgf, Author: yhgf
Book ID: 4, Title: ujhi, Author: ikmn
Book ID: 5, Title: uht, Author: kjh

 welcome to library management system...
1.enter books details
2.add books
3.replace books
4.display all books
5.exit
enter choice from 1 to 5
2
Enter book ID: 45
Enter book Title: tas
Enter book Author: tgf
Is Available (true/false): true
Library is full!

 welcome to library management system...
1.enter books details
2.add books
3.replace books
4.display all books
5.exit
enter choice from 1 to 5
3
Enter book ID to replace: 101
Enter new title: radha
Enter new author: rama
Book updated successfully!

 welcome to library management system...
1.enter books details
2.add books
3.replace books
4.display all books
5.exit
enter choice from 1 to 5
4
Book ID: 101, Title: radha, Author: rama
Book ID: 2, Title: thg, Author: yhg
Book ID: 3, Title: uhgf, Author: yhgf
Book ID: 4, Title: ujhi, Author: ikmn
Book ID: 5, Title: uht, Author: kjh

 welcome to library management system...
1.enter books details
2.add books
3.replace books
4.display all books
5.exit
enter choice from 1 to 5
5
thank you!have a good day
*/

