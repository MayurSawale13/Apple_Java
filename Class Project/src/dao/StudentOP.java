package dao;

import java.util.Scanner;

import pojo.Marks;
import pojo.Student;

public class StudentOP {
	Student s1[] = new Student[2];

	Scanner sc = new Scanner(System.in);

	public void insertData() {
		for (int i = 0; i < 2; i++) {
			Student s = new Student();
			System.out.println("Enter data for student " + (i + 1) + " id,name,email,contact,dept");
			int id = sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			String contact = sc.next();
			String dept = sc.next();
			int pcm[] = new int[2];
			for (int j = 0; j < pcm.length; j++) {

				System.out.println("Enter marks for " + (j + 1) + "sem: ");
				int p = sc.nextInt();
				pcm[j] = p;
			}
			s.setId(id);
			s.setName(name);
			s.setEmail(email);
			s.setContact(contact);
			s.setDept(dept);
			s.setMark(pcm);
			s1[i] = s;
		}
	}

	public void display() {
		for (Student x : s1)
			System.out.println(x);
	}

	public void updateEmail() {
		System.out.println("Enter Student id and new email");
		int sid = sc.nextInt();
		String newEmail = sc.next();
		for (Student x : s1) {
			if (s1 != null) {
				if (x.getId() == sid) {
					x.setEmail(newEmail);
					System.out.println("Email updated Sucessfully!!\n" + x);
				}
			}
		}
	}

	public void updateContact() {
		System.out.println("Enter Student id and new Contact");
		int sid = sc.nextInt();
		String newContact = sc.next();
		for (Student x : s1) {
			if (s1 != null) {
				if (x.getId() == sid) {
					x.setContact(newContact);
					System.out.println("Contact update Sucessfully!!\n" + x);
				}
			}
		}
	}

	public void searchDetails() {
		System.out.println("Enter Student id to be search");
		int sid = sc.nextInt();

		for (Student x : s1) {
			if (s1 != null) {
				if (x.getId() == sid) {
					System.out.println(x);
				}
			}
		}
	}
}
