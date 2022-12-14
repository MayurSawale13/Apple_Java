package employee_project;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMethod {
	Employee e[] = new Employee[10];
	Scanner sc = new Scanner(System.in);

	public void existingEmp() {
		System.out.println("Enter number of Employees to add");
		int size=sc.nextInt();
			
		for (int i = 0; i < size; i++) {
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
	public void addNewEmp()
	{
		Employee e1=new Employee(); 
		System.out.println("Enter details for employee  id ,salary,name and dept");
		int id = sc.nextInt();
		float s = sc.nextFloat();
		String name = sc.next();
		String dept = sc.next();
		
		e1.setId(id);
		e1.setSalary(s);
		e1.setName(name);
		e1.setDept(dept);
		for(int i=0;i<e.length;i++)
		{
			if(e[i]==null)
			{
				e[i]=e1;
				break;
			}
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
			if (x.getId() == id && e!=null) {
				System.out.println("Employee Details:\n" + x);
			}

		}
	}

	void updateData() {
		System.out.println("Enter Employee id to update");
		int id = sc.nextInt();
		System.out.println("Enter new Salary:");
		float newSal = sc.nextFloat();
		for (Employee x : e ) {
			if (x.getId() == id && e!=null) {
				x.setSalary(newSal);
				System.out.println("new Salary Employee Details:\n" + x);
			}
		}
	}

	void deleteData() {
		System.out.println("Enter Emp id To delete:");
		int id = sc.nextInt();
		int index=0;
		Employee arr[] = new Employee[e.length - 1];
		
		int j = 0, i = 0;
		for (Employee x : e) {

			if(x!=null){
			if (x.getId() == id ) {
				i++;
				continue;
				

			} else{
				arr[j] = e[i];
					j++;
			}
			i++;
		}
		}
		System.out.println(Arrays.toString(arr));
		for(int k=0;k<arr.length;k++)
		{
			e[k]=arr[k];
		}
		
		System.out.println(Arrays.toString(e));

	}

	public static void main(String[] args) {
		EmployeeMethod m = new EmployeeMethod();

		
		m.existingEmp();
		m.viewData();
		
		m.deleteData();
		m.viewData();
		m.deleteData();
		m.viewData();
		
	}
}
