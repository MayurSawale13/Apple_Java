package arrays;

import java.util.Scanner;

public class MainCompDept {

	public static void main(String[] args) {
		Company c[] = new Company[2];

		Scanner sc = new Scanner(System.in);
		/*
		 * dept[0]=new Department(1000,"hr",50); dept[1]=new
		 * Department(1001,"marketing",70); dept[2]=new
		 * Department(1002,"sales",60); for(Department d:dept) {
		 * System.out.println(d); }
		 */
		for (int i = 0; i < c.length; i++) {
			Department dept[] = new Department[3];
			System.out.println("Enter Comp id ,name");
			int cid = sc.nextInt();
			String cname = sc.next();
			for (int j = 0; j < dept.length; j++) {
				System.out.println("Enter Dept id,name and totalEmp");
				int did = sc.nextInt();
				String dname = sc.next();
				int c1 = sc.nextInt();
				dept[j] = new Department(did, dname, c1);
			}
			c[i] = new Company(cid, cname, dept);
		}

		for (Company ci : c) {
			System.out.println(ci);
		}
		sc.close();
	}

}
