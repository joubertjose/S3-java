class BookObject{
	String title;
	String author;
	double price;
	int quantity;
	double total;
	BookObject(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity =quantity;
		
	}
	public void displayDetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price"+price);
		System.out.println("Quantity:"+quantity);
	}
	public void totalValue() {
		total=(price*quantity);
		
	}
}
public class Book {

}
