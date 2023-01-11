package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	void addEmp(ArrayList<Employee> al)
	{
		al.add(new Employee(60,150000,"mayur","dev",'M'));
		al.add(new Employee(46,350000,"Akhil","test",'M'));
		al.add(new Employee(35,600000,"Amrata","hr",'F'));
		al.add(new Employee(71,850000,"rahul","sales",'M'));
		al.add(new Employee(49,250000,"Amrata","sales",'F'));
		
	}

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		EmployeeMain b=new EmployeeMain();
		b.addEmp(al);
		System.out.println(al);
		System.out.println("======sort using comparable with id====");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("----sort using comparator with name");
		
		
		Collections.sort(al,new EmployeeNameSort());
		System.out.println(al);
	}

}
