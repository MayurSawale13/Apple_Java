package test;

import java.util.Scanner;

import dao.EmployeeOperations;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeOperations m = new EmployeeOperations();
		Scanner sc = new Scanner(System.in);
		String c = "";
		do {
			System.out.println("Enter number from list to perform operation:\n" + "1.Add Existing Employees\n"
					+ "2.Add New Employee\n" + "3.Display all Employee Details\n" + "4.Search Employee Details\n"
					+ "5.Update Employee Salary\n" + "6.Delete Employee Details");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				m.existingEmp();
				m.viewData();
				break;
			case 2:
				m.addNewEmp();
				m.viewData();
				break;
			case 3:
				m.viewData();
				break;
			case 4:
				m.viewSpecificData();
				break;
			case 5:
				m.updateData();
				break;
			case 6:
				m.deleteData();
				m.viewData();
				break;
			default:
				System.out.println("Invalid Number!! Please choose number from list");
				break;
			}
			System.out.println("Do you want to continue:y/n");
			c = sc.next();
		} while (c.equalsIgnoreCase("Y"));
		sc.close();
	}

}
