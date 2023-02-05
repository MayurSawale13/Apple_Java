package test;

import java.util.Scanner;

import dao.EmpOp;

public class EmpArrayListMain {

	public static void main(String[] args) {
		EmpOp e = new EmpOp();
		String s = "";
		do {
			System.out.println("1-add\n2-search\n3-update\n4-delete\n5.display");
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
			switch (c) {
			case 1:
				e.addEmp();
				e.display();
				break;
			case 2:
				e.search();
				break;
			case 3:
				e.update();
				break;
			case 4:
				e.delete();
				break;
			case 5:e.display();
				break;
			}
			System.out.println("enter to continue:y/n");
			s = sc.next();
		} while (s.equalsIgnoreCase("y"));

	}

}
