package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import pojo.Emp;

public class EmpOp {

	ArrayList<Emp> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addEmp() {
		al.add(new Emp(1, "mayur", "dev", 11502.0f));
		al.add(new Emp(6, "atif", "dev", 251502.0f));
		al.add(new Emp(7, "sagar", "test", 25602.0f));
		al.add(new Emp(9, "vishal", "sales", 68502.0f));
		al.add(new Emp(24, "vishakha", "HR", 71502.0f));
		al.add(new Emp(62, "dave", "admin", 51502.0f));
	}

	public void display() {
		for (Emp x : al)
			System.out.println(x);
	}

	public void search() {
		System.out.println("Enter emp id to search");
		int id = sc.nextInt();
		for (Emp e : al) {
			if (e.id == id) {
				System.out.println("Emp found!!");
				System.out.println(e);
			}
		}
	}

	public void delete() {
		System.out.println("Enter emp id to delete:");
		int id = sc.nextInt();
		Iterator<Emp> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next().id == id)
				itr.remove();
		}
		System.out.println("Emp deleted sucessfully!!");

	}

	public void update() {
		System.out.println("Enter emp id and new dept to be updated");
		int id = sc.nextInt();
		String d = sc.next();
		for (Emp x : al) {
			if (x.id == id) {
				x.dept = d;
				System.out.println(x);
				System.out.println("Dept updated!!!");
			}
		}
	}

}
