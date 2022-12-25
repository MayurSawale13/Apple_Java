package dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import pojo.Book;
import pojo.Studen;
import pojo.Transcation;

public class Library {
	Book books[] = new Book[5];
	Studen s[] = new Studen[2];
	Transcation tr[] = new Transcation[10];
	boolean bookAvailable = true;
	Scanner sc = new Scanner(System.in);

	public Library() {
		books[0] = new Book(1001, 2, "ScienceBook", "baskar");
		books[1] = new Book(1002, 1, "Coding", "ravi sunder");
		books[2] = new Book(1003, 3, "Java", "madhu pillai");
		books[3] = new Book(1045, 5, "History", "ram chandra guha");
		books[4] = new Book(1005, 0, "Geography", "prabhu k");
	}

	public void viewBooks() {
		for (Book x : books) {
			System.out.println(x);
		}
		for (Transcation x : tr) {
			System.out.println(x);
		}
	}

	public void issueBook() {

		Studen s1 = new Studen();
		Book b = new Book();
		System.out.println("Enter Student Details:sid,name,email,contact,dept");
		int id = sc.nextInt();
		String name = sc.next();
		String email = sc.next();
		String c = sc.next();
		String dept = sc.next();
		s1.setSid(id);
		s1.setName(name);
		s1.setEmail(email);
		s1.setContact(c);
		s1.setDept(dept);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = s1;
				break;
			}

		}
		Transcation t = new Transcation();
		System.out.println("Enter bookname:");
		String bookName = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Calendar c1 = Calendar.getInstance();
		String issueDate = sdf.format(c1.getTime());
		c1.add(Calendar.DATE, 30);
		String returnDate = sdf.format(c1.getTime());
		t.setS(s1);
		t.setBname(bookName);
		t.setIssueDate(issueDate);
		t.setReturnDate(returnDate);
		for (Book x1 : books) {
			if (x1 != null) {
				if (x1.getName().equalsIgnoreCase(bookName) && x1.getCopyno() == 0) {
					System.out.println("Book not Available");
					bookAvailable = false;
					break;
				}
			}
		}

			for (int i = 0; i < tr.length; i++) {

				if (tr[i] == null ) {
					tr[i] = t;
					t.setBookIssue(true);
					break;
				}
			}
		

		for (Book x : books) {
			if (x != null) {

				if (x.getName().equalsIgnoreCase(bookName)) {
					if (bookAvailable == true && x.getCopyno() > 0) {
						int count = x.getCopyno();
						x.setCopyno(count - 1);
					}
				}
			}

		}
	}

	public void returnBook() {
		System.out.println("Enter bookname: ");
		String bookname = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Calendar c1 = Calendar.getInstance();
		String returnDate = sdf.format(c1.getTime());

		for (Transcation s : tr) {
			if (s != null) {
				if (s.getBname().equalsIgnoreCase(bookname)) {
					s.setReturnDate(returnDate);
					s.setBookIssue(false);
					System.out.println("BookName: " + s.getBname() + " Issued on " + s.getIssueDate() + " returned by "
							+ s.getS().getName() + " on date " + s.getReturnDate());

				}
			}
		}
		for (Book x : books) {
			if (x != null) {
				if (x.getName().equalsIgnoreCase(bookname)) {
					int count = x.getCopyno();
					x.setCopyno(count + 1);
				}

			}
		}
	}

	public void availabilityBook() {
		System.out.println("Enter bookname: ");
		String bk = sc.next();
		for (Book x : books) {
			if (x != null) {
				if (x.getName().equalsIgnoreCase(bk)) {
					if (x.getCopyno() == 0) {
						System.out.println(x.getName() + " is not available");
					} else
						System.out.println("Available copies of " + x.getName() + " : " + x.getCopyno());
				}
			}
		}
	}

	public void bookIssueDetails() {
		System.out.println("Enter Book Name:");
		String bk = sc.next();
		for (Transcation x : tr) {
			if (x != null) {
				if (x.getBname().equalsIgnoreCase(bk)) {
					if (x.isBookIssue() == true) {
						System.out.println(
								x.getBname() + " is issued to " + x.getS().getName() + " on date " + x.getIssueDate());
						System.out.println("Book Not Returned Excepted return Date till: +" + x.getReturnDate());
					} else
						System.out.println(
								x.getBname() + " returned by " + x.getS().getName() + " on date " + x.getReturnDate());
				}
			}
		}
	}
}
