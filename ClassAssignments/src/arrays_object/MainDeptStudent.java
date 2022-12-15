package arrays_object;

import java.util.Scanner;

public class MainDeptStudent {

	public static void main(String[] args) {
		Department d[] = new Department[1];
		Department d1 = new Department();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < d.length; i++) {
			System.out.println("Enter values for Dept id and name ");
			int did = sc.nextInt();
			String dname = sc.next();

			Student s[] = new Student[2];
			for (int j = 0; j < s.length; j++) {
				Student s1 = new Student();
				System.out.println("Enter values for Student ");
				int sid = sc.nextInt();
				String sname = sc.next();
				s1.setSid(sid);
				s1.setSname(sname);
				s[j] = s1;
			}
			d1.setDid(did);
			d1.setName(dname);
			d1.setS(s);
		}
		for (Department a : d) {
			for (Student c : d1.s) {
				if (c.getSid() == 2) {
					System.out.print(c.getSid() + "= " + c.getSname());
				}
			}
		}

	}

}
