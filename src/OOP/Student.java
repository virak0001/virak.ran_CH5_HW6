package OOP;

import java.util.ArrayList;

public class Student {
	private String firstname;
	private String batch;
	private  ArrayList<Book> bookCart;
	Student(String firstname, String batch){
		bookCart = new ArrayList<Book>();
		this.firstname = firstname;
		this.batch = batch;
	}
	public void borrowedBook(Book borrowed) {
		
		if (borrowed.isBorrowed()) {
			System.out.println("This book isn't available");
		}else {
			if (bookCart.size() < 3) {
				bookCart.add(borrowed);
			}else {
				System.out.println("You could borrow only maximum 3 books");
			}
		}
	}
	public void getBookCart(ArrayList<Book> bookCart) {
		this.bookCart = bookCart;
	}
	public void returnBook(Book borrow) {
		
		if (!bookCart.contains(borrow)) {
			System.out.println("You didn't borrow this book");
		}
	}
	public String toString() {
		return firstname + " of class " + batch + " has borrowed:" ;
	}
}

