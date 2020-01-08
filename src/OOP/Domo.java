package OOP;

import java.util.ArrayList;

public class Domo {

	public static void main(String[] args) {
		
		Book book1 = new Book("Don't Make Me Think", "Steve Krung ", 2000);
		book1.borrow();
		System.out.println(book1);
		Book book2 = new Book("Pro Java Programming","Terrill",2005);
		book2.returnBack();
		System.out.println(book2);
		Book book3 = new Book("Programming in Python 3", "Mark Summerfield", 2005);
		book3.borrow();
		System.out.println(book3);
		Book book4 = new Book("The Clean Coder","Robert",2011);
		book4.borrow();
		System.out.println(book4);
		Book book5 = new Book("The Art Of Agile Development","James Shore",2005);
		book5.returnBack();
		System.out.println(book5);
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2014);
		book6.returnBack();
		System.out.println(book6);
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		book7.borrow();
		System.out.println(book7);
		Book book8 = new Book("Code Complete","Steve",1993);
		book8.returnBack();
		System.out.println(book8);
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		book9.returnBack();
		System.out.println(book9);
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		book10.borrow();
		System.out.println(book10);
		
		ArrayList<Book> books=new ArrayList<Book>();  
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.printf("%30s %20s %20s %20s", "TITLE", "AUTHOR", "YEAR", "STATUS");
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------");
		for (Book book:books) {
			System.out.printf("%30s %20s %20s %20s", book.getTitle(), book.getAuthor(), book.getPublishYear(), book.status);
			System.out.println();
		}

		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println();
		Student student = new Student ("VIRAK ","WEP2020-A has borrowed:");
		student.borrowedBook(book1);
		student.borrowedBook(book2);
		student.borrowedBook(book5);
		student.borrowedBook(book6);
		student.borrowedBook(book8);
		System.out.println(student);
		System.out.println(book2.getTitle());
		System.out.println(book5.getTitle());
		System.out.println(book6.getTitle());
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.printf("%30s %20s %20s %20s", "TITLE", "AUTHOR", "YEAR", "STATUS");
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------");
		for (Book book:books) {
			System.out.printf("%30s %20s %20s %20s", book.getTitle(), book.getAuthor(), book.getPublishYear(), book.status);
			System.out.println();
		}
	}
}