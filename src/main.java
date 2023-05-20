import java.util.Scanner;
import java.util.ArrayList;

//Difference between Interface and Abstract
//Main difference is that abstract class is extended (Using extends keyword) and interface is implemented (Using implements keyword)
//Abstract class can have abstract methods and non-abstract methods, but when it comes to interface class there will be only abstract methods
//Interface can have multiple inheritance but abstract can only have one inheritance

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Creating Books object
		Books book1 = new Books("The Psychology of Money", "Morgan Housel", 2020, "The Psychology of Money explores how money moves around in an economy \nand how personal biases and the emotional factor play an important \nrole in our financial decisions, as well as how to think more \nrationally and make better \ndecisions when it comes to money.", true);
		Books book2 = new Books("The Intelligent Investor", "Benjamin Graham", 1949, "The Intelligent Investor explains value investing, which is focused on \n enerating steady, long-term profits by ignoring the \ncurrent market and picking companies with high intrinsic value", true);
		//Creating array list for storing borrowed books
		ArrayList<Books> myList = new ArrayList<>();
		//Creating myUser object
		myUser mainUser = new myUser("2540119280","Kevin Lo", "Computer Science", myList);
		int option = 0;
		
		do {
			System.out.println("Library");
			System.out.println("=================");
			System.out.println("1. My Info");
			System.out.println("2. Borrow Books");
			System.out.println("3. Return Books");
			System.out.println("4. My List");
			System.out.println("5. Exit");
			System.out.print(">>");
			option = scan.nextInt();
			switch(option) {
				case 1:
					//Getting user info
					mainUser.myInfo();
					break;
				case 2:
					int choice = 0;
					System.out.println("List of Books");
					System.out.println("==============");
					System.out.println("1. The Psychology of Money");
					System.out.println("2. Sherlock Holmes");
					System.out.print(">>");
					choice = scan.nextInt();
					
					//Borrowing book 1
					if(choice == 1) {
						int borrow = 0;
						book1.getInfo();
						System.out.println("Borrow ?");
						System.out.println("Press 1 for borrow, 0 for cancel");
						System.out.print(">>");
						borrow = scan.nextInt();
						
						if(borrow == 1) {
							//Calling borrow book function
							mainUser.borrowBook(book1);
						}
						else {
							continue;
						}
					}
					
					//Borrowing book 2
					if(choice == 2) {
						int borrow = 0;
						book2.getInfo();
						System.out.println("Borrow ?");
						System.out.println("Press 1 for borrow, 0 for cancel");
						System.out.print(">>");
						borrow = scan.nextInt();
						
						if(borrow == 1) {
							//Calling borrow book function
							mainUser.borrowBook(book2);
						}
						else {
							continue;
						}
					}
					break;
				case 3:
					//Returning Book
					int returnBook = 0;
					System.out.println("Choose Book: ");
					System.out.println("===============");
					mainUser.myList();
					System.out.print(">> (0 for cancel)");
					returnBook = scan.nextInt();
					
					if(returnBook == 0) {
						continue;
					}
					
					//Calling return book function
					mainUser.returnBook(myList.get(returnBook - 1));
					break;
				case 4:
					//Getting list of borrowed books
					mainUser.myList();
					break;
			}
		}while(option != 5);
		
	}

}
