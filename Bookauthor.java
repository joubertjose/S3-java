package javalabsss;

	class Book {

	    String title;
	    String author;
	    final int bookID;


	    static int bookCounter = 1000;
	    final static String LIBRARY_NAME = "Central Library";


	    public Book() {
	        this.title = "Unknown Title";
	        this.author = "Unknown Author";
	        this.bookID = bookCounter++;
	    }

	  
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.bookID = bookCounter++;
	    }


	    public void displayInfo() {
	        System.out.println("Title: " + this.title);
	        System.out.println("Author: " + this.author);
	        System.out.println("Book ID: " + this.bookID);
	    }


	    public void displayInfo(boolean showLibrary) {
	        System.out.println("Title: " + this.title);
	        System.out.println("Author: " + this.author);
	        System.out.println("Book ID: " + this.bookID);
	        if (showLibrary) {
	            System.out.println("Library Name: " + LIBRARY_NAME);
	        }
	    }


	    public static void displayTotalBooks() {
	        System.out.println("Total books added: " + (bookCounter - 1000));
	    }

	    public static void main(String[] args) {

	        Book book1 = new Book();
	        Book book2 = new Book("Java Programming", "James Gosling");
	        Book book3 = new Book("Effective Java", "Joshua Bloch");

	        
	        System.out.println("Book 1 Info:");
	        book1.displayInfo();
	        book1.displayInfo(true);

	        System.out.println("\nBook 2 Info:");
	        book2.displayInfo();
	        book2.displayInfo(true);

	        System.out.println("\nBook 3 Info:");
	        book3.displayInfo();
	        book3.displayInfo(true);

	        
	        displayTotalBooks();
	    }
	}

