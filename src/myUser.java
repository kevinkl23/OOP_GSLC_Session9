import java.util.ArrayList;

//Implementing user class
public class myUser extends User{
	public String studentID;
	public String name;
	public String major;
	public ArrayList<Books> myList = new ArrayList<>();
	
	//Constructor
	public myUser(String studentID, String name, String major, ArrayList<Books> myList) {
		this.studentID = studentID;
		this.name = name;
		this.major = major;
		this.myList = myList;
	}
	
	//Method for getting user info
	@Override
	public void myInfo() {
		System.out.println("Student ID :" + this.studentID);
		System.out.println("Name :" + this.name);
		System.out.println("Major :" + this.major);
	}

	//Method for borrowing books
	@Override
	public void borrowBook(Books Book) {
		if(Book.status == true) {
			Book.borrowBook();
			myList.add(Book);
		}
		else {
			Book.borrowBook();
		}
	}
	
	//Method for returning books
	@Override
	public void returnBook(Books Book) {
		if(Book.status == false) {
			Book.returnBook();
			myList.remove(myList.indexOf(Book));
		}
		else {
			Book.returnBook();
		}
	}
	
	//Method for seeing list of borrowed books
	@Override
	public void myList() {
		System.out.println("My List :");
		int count = 1;
		for(Books book: myList) {
			System.out.print(count + ". ");
			System.out.println(book.title);
			count++;
		}
	}
}
