package constructor;

import java.util.Scanner;

public class Movie {
	int id, roy;
	String producer, name, budget;

	Movie(int i, int y, String p, String n, String b) {
		id = i;
		roy = y;
		producer = p;
		name = n;
		budget = b;
	}

	void display() {
		System.out.println("Movie Id: " + id);
		System.out.println("Movie Name: " + name);
		System.out.println("Movie Release Year: " + roy);
		System.out.println("Movie Producer Name: " + producer);
		System.out.println("Movie Budget: " + budget);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Objects:");
		int s = sc.nextInt();
		for (int i = 1; i <= s; i++) {
			System.out.println("Enter details of object of " + i);
			System.out.println("Enter movie id,Realese Year:");
			int id1 = sc.nextInt();
			int y1 = sc.nextInt();
			System.out.println("Enter name,producer and budget:");
			String n1 = sc.next();
			String p1 = sc.next();
			String b1 = sc.next();
			Movie m = new Movie(id1, y1, p1, n1, b1);
			m.display();
		}
		
		sc.close();

	}

}
