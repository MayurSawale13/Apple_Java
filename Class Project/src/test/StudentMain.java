package test;

import java.util.Scanner;

import dao.StudentOP;

public class StudentMain {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		StudentOP s = new StudentOP();
		String c;
		do {
			System.out.println("Please Enter your choice :" + "1.insert Student information\n"
					+ "2.update Student email\n" + "3.update student contact\n" + "4.search student details\n"
					+ "5.to view all Student Info");
			int op = ch.nextInt();

			switch (op) {

			case 1:
				s.insertData();
				s.display();
				break;
			case 2:
				s.updateEmail();
				break;
			case 3:
				s.updateContact();
				break;
			case 4:
				s.searchDetails();
				break;
			case 5:
				s.display();
				break;
			default:
				System.out.println("!!Invalid Number---please enter number from list!!");
			}
			System.out.println("Do you want to continue:y/n");
			c = ch.next();
		} while (c.equalsIgnoreCase("y"));

		ch.close();

	}

}
