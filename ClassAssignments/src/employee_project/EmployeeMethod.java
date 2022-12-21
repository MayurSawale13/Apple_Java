package employee_project;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMethod {
	Employee e[] = new Employee[3];
	Scanner sc = new Scanner(System.in);

	void insertData() {
		for (int i = 0; i < e.length; i++) {
			Employee e1 = new Employee();

			System.out.println("Enter details for employee " + (i + 1) + " id ,salary,name and dept");
			int id = sc.nextInt();
			float s = sc.nextFloat();
			String name = sc.next();
			String dept = sc.next();

			e1.setId(id);
			e1.setSalary(s);
			e1.setName(name);
			e1.setDept(dept);

			e[i] = e1;
		}
	}

	void viewData() {
		for (Employee x : e) {
			System.out.println(x);
		}
	}

	void viewSpecificData() {
		System.out.println("Enter Employee id to search");
		int id = sc.nextInt();

		for (Employee x : e) {
			if (x.getId() == id) {
				System.out.println("Employee Details: " + x);
			}

		}
	}

	void updateData() {
		System.out.println("Enter Employee id to update");
		int id = sc.nextInt();
		System.out.println("Enter new Salary:");
		float newSal = sc.nextFloat();
		for (Employee x : e) {
			if (x.getId() == id) {
				x.setSalary(newSal);
				System.out.println("new Salary Employee Details: " + x);
			}
		}
	}

	void deleteData() {
		System.out.println("Enter Emp id To delete:");
		int id = sc.nextInt();

		Employee arr[] = new Employee[e.length - 1];

		int j = 0, i = 0;
		for (Employee x : e) {

			if (x.getId() != id) {
				arr[j] = e[i];
				j++;

			} else
				continue;
			i++;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		EmployeeMethod m = new EmployeeMethod();

		
		m.insertData();
		m.viewData();
		m.viewSpecificData();
		m.updateData();
		m.deleteData();
	}
}
