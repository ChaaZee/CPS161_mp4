package book;

public class Book {
	
	private String name = "";
	private Author author = new Author();
	private String isbn = "";
	private double price = 0;
	
	public String getName() {
		return name;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setIsbn(String i) {
		isbn = i;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void setAuthor(String f, String l, String b) {
		author.setFirstName(f);
		author.setLastName(l);
		author.setBirthday(b);
	}
	
	public Book(String n, String i, double p) {
		name = n;
		isbn = i;
		price = p;
	}
	
	public String toString() {
		return "Book[" + name + " by " + author + " isbn: " + isbn + ", price: " + price + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "B017V4IMVQ", 11.99);
		book1.setAuthor("JK", "Rowling", "1965-07-31");
		
		Book book2 = new Book("Harry Potter and the Chamber of Secrets", "B017V4IPPO", 13.00);
		book2.setAuthor("JK", "Rowling", "1965-07-31");
		
		System.out.println(book1);
		System.out.println(book2);
		
		if(book1.equals(book2)) {
			System.out.println("They are the same book");
		} else {
			System.out.println("They are not the same book");
		}
	}

}
