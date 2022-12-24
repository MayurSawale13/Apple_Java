package test;

import java.util.Scanner;

import dao.Library;

public class LibraryMain {

	public static void main(String[] args) {
		Library l = new Library();
		Scanner sc = new Scanner(System.in);
		String s = "";
		do {
			System.out.println("Library Register\n" + "1.To Issue Book\n" + "2.To Return Book\n"
					+ "3.Display Book Details\n" + "4.Check Book Avalibility\n" + "5.Check Book Issue/Return Details");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				l.issueBook();
				l.viewBooks();
				break;
			case 2:
				l.returnBook();
				l.viewBooks();
				break;
			case 3:
				l.viewBooks();
				break;	
			case 4:
				l.availabilityBook();
				break;	
			case 5:
				l.bookIssueDetails();;
				break;	
			default:
				System.out.println("Invalid Selection !! enter number from list");
			}
			System.out.println("Do you want to continue:(y/n)");
			s = sc.next();
		} while (s.equalsIgnoreCase("Y"));

	}

}
