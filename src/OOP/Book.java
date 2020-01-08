package OOP;

public class Book {
	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed;
	Book(String title, String author, int publishYear){
		this.title = title;
		this.author=author;
		this.publishYear = publishYear;
	};
	
	
	// Borrowed
	public void borrow() {
		isBorrowed = true;
	}
	
	
	//returnBack
	public void returnBack() {
		isBorrowed = false;
	}
	
	
	//get title
	public String getTitle() {
		return title;
	}
	
	
	//get author
	public String getAuthor() {
		return author;
	}
	
	//get publishYear
	public int getPublishYear() {
		return publishYear;
	}
	
	// isBorrowed
	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	//toString 
	String status = "";
	public String toString() {
		
		if (isBorrowed == true) {
			status = "Not available";
		}else {
			status = "Available";
		}
		return "Titile: " + title + "\nby " + author + "--published " + publishYear +
				"\nstatus: " + status + " to borrow";
	}
}

