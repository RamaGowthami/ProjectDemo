package TaskThree;
import java.util.*;
public class Library 
{
	//an array to store book objects.
	private Book[] books;private int count;
	Scanner Sc=new Scanner(System.in);
	Library()
	{
	this.books=new Book[5];	
	 count = 0;
	}
	
	// Add book to library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }
	//method to replace the book from the library
	public void replaceBook(int bookID) 
	{
	//replace the book name and	author of the given bookID from the books.
		
          boolean bookFound = false;
        
            for (int i = 0; i < count; i++) 
            {
               if (books[i] != null && books[i].getBookID() == bookID) 
               {
                    System.out.print("Enter new title: ");
                    String newTitle = Sc.nextLine();
                    books[i].setTitle(newTitle);

                    System.out.print("Enter new author: ");
                    String newAuthor = Sc.nextLine();
                    books[i].setAuthor(newAuthor);

                    System.out.println("Book updated successfully!");
                    bookFound = true;
                    break;
               }
            }
        
        if (!bookFound) 
        {
            System.out.println("Book ID not found!");
        }
    }
	//method to display all books in the library.
	public void displayBooks()
	{
		if (count == 0) 
		{
            System.out.println("No books available in the library.");
            return;
        }
		for(int i=0;i<books.length;i++) 
		{
			if(books[i]!=null)
			books[i].displayBook();
		
		}
	}
}
