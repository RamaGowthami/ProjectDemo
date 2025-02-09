/*Design a java program that uses oop principles to model the book.*/
//data encapsulation.
package TaskThree;

public class Book 
{
private int bookID;//The book class should have Attributes such as bookID ,title,author,isAvailable.
private String title;
private String author;
private boolean isAvailable;
public Book(int bookID, String title, String author, boolean isAvailable) 
{
	//constructor to initialize Book class Attributes.
	this.bookID = bookID;
	this.title = title;
	this.author = author;
	this.isAvailable = isAvailable;
}
//getter and setter methods for book attributes.
public int getBookID() {
	return bookID;
}
public void setBookID(int bookID) {
	this.bookID = bookID;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public boolean isAvailable() {
	return isAvailable;
}
public void setAvailable(boolean isAvailable) {
	this.isAvailable = isAvailable;
}
// Display book details
public void displayBook() {
    System.out.println("Book ID: " + bookID + ", Title: " + title + ", Author: " + author);
}

}
