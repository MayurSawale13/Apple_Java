package written;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
	void addEmp(ArrayList<Employee> al1) {
		al1.add(new Employee(14, "mayur", "dev", new Profile("MH", "India")));
		al1.add(new Employee(7, "zack", "sales", new Profile("texas", "Germany")));
		al1.add(new Employee(9, "emma", "hr", new Profile("London", "England")));
		al1.add(new Employee(20, "mayur", "Testing", new Profile("Paris", "France")));
	}

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeMain e = new EmployeeMain();
		e.addEmp(al);
		System.out.println(al);
		System.out.println("---Sort Based on name and id");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("----Sort based on country----");
		Collections.sort(al, new ProfileSort());
		System.out.println(al);
		
	}
}
