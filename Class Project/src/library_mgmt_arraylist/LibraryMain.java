package library_mgmt_arraylist;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LibraryOp m=new LibraryOp();
		String s="";
		do{
		System.out.println("Library Register\n" + "1.To Issue Book\n" + "2.To Return Book\n"
				+ "3.Display Book Details\n"  + "4.Check Book Issue/Return Details");
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			m.issueBook();
			m.display();
			break;
		case 2:
			m.returnBook();
			break;
		case 3:
			m.display();
			break;
		case 4:
			m.checkBookDetails();
			break;
		default:System.out.println("enter number from list");
				break;
		}
		System.out.println("do you want contnue:y/n");
		s=sc.next();
		}while(s.equalsIgnoreCase("y"));
		sc.close();
			

	}

}
