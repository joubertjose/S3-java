package javalabes;

class Books{
	String title;
	String author;
	double price;
	int quantity;
	Books(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}

	public double calculateTotal() {
	return (price*quantity);
}
	public void displayDetails() {
		System.out.println("Title" + title);
		System.out.println("Author" + author);
		System.out.println("Price" + price);
		System.out.println("Quantity" + quantity);
		
		System.out.println("Total value" +calculateTotal());
	}
}

public class Book {
	
	public static void main(String[] args) {
		Books Books1=new Books("Alchemist","Paulo Coelho",100,50);
		Books Books2=new Books("Beloved","Toni Morrison",250,50);
		Books1.displayDetails();
		Books2.displayDetails();
		
	}
}
