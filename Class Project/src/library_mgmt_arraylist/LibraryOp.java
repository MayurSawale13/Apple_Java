package library_mgmt_arraylist;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class LibraryOp {
	ArrayList<Student> stu = new ArrayList<>();
	ArrayList<Book> books = new ArrayList<>();
	ArrayList<Transaction> tr = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	LibraryOp() {
		books.add(new Book(12, 3, "java", "dave george"));
		books.add(new Book(15, 2, "python", "george sen"));
		books.add(new Book(11, 0, "c#", "rk sharma"));

		stu.add(new Student(104, "sandeep", "795647256", "civil"));
		stu.add(new Student(105, "shilpa", "956447298", "IT"));
		stu.add(new Student(106, "vidhya", "845647456", "cs"));
		stu.add(new Student(107, "joe", "985674564", "MBA"));
	}

	public void display() {
		for (Book b : books)
			System.out.println(b);
		for (Transaction x : tr)
			System.out.println(x);
		for (Student x : stu)
			System.out.println(x);

	}

	public void issueBook() {
		Student s = null;
		System.out.println("Enter student id to issue book");
		int id = sc.nextInt();
		int flag = 0;
		for (Student s1 : stu) {

			if (s1.sid == id) {
				s = s1;
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("Enter student name,contact,dept");
			String sname = sc.next();
			String c = sc.next();
			String d = sc.next();
			s = new Student(id, sname, c, d);
			stu.add(s);
		
		}
		System.out.println("Enter bookname to issue");
		String bname = sc.next();
		Book b = null;
		for (Book x : books) {
			if (x.bname.equalsIgnoreCase(bname)) {
				b = x;
			}
			if (bname.equalsIgnoreCase(x.bname) && x.copy_no == 0) {
				System.out.println("book not available");
				break;
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Calendar c1 = Calendar.getInstance();
		String issueDate = sdf.format(c1.getTime());
		c1.add(Calendar.DATE, 30);
		String returnDate = sdf.format(c1.getTime());
		Transaction t = new Transaction(s, b, issueDate, returnDate);
		
		tr.add(t);
		
		for (Book x : books) {
			if (x.bid == t.b.bid && x.copy_no != 0)
				x.copy_no--;
		}
		System.out.println(stu);
	}

	public void returnBook() {
		
		System.out.println("Enter book id ");
		int bid = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Calendar c1 = Calendar.getInstance();
		String returnDate1 = sdf.format(c1.getTime());
		for (Transaction t : tr) {
			if (t.b.bid == bid) {
				
				t.rdate = returnDate1;
				System.out.println(t.b.bname + " is returned by " + t.s.sname + " on" + t.rdate);
			}
			
		}
		for (Book b : books) {
			if (b.bid == bid)
				b.copy_no++;
		}
		
	}
	

	void checkBookDetails() {
		System.out.println("Enter book id ");
		int bid = sc.nextInt();
		for (Transaction t : tr) {
			if (t.b.bid == bid) {
				System.out.println(t.s.sname + " " + t.b.bname);
			}
		}
	}
}
