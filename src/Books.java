//Implementing library interface with books class

public class Books implements Library{
	public String title;
	public String authorName;
	public Integer year;
	public String synopsis;
	public Boolean status;
	
	//Constructor
	public Books(String title, String authorName, Integer year, String synopsis, Boolean status) {
		this.title = title;
		this.authorName = authorName;
		this.year = year;
		this.synopsis = synopsis;
		this.status = status;
	}
	
	//Method for borrowing books
	@Override
	public void borrowBook() {
		if(this.status == true) {
			this.status = false;
			System.out.println("Book is borrowed!");
		}
		else {
			System.out.println("Book is not available at this moment!");
		}
	}
	
	//Method for returning book
	@Override
	public void returnBook() {
		if(this.status == false) {
			this.status = true;
			System.out.println("Book is returned!");
		}
		else {
			System.out.println("Book is not borrowed!");
		}
	}
	
	//Method for getting book's info
	@Override
	public void getInfo() {
		System.out.println("Title : " + this.title);
		System.out.println("Author Name : " + this.authorName);
		System.out.println("Publicatiobn Year : " + this.year);
		System.out.println("Synopsis : ");
		System.out.println(this.synopsis);
		System.out.println("=================================");
	}
	
	}