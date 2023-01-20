package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	void addEle(ArrayList<Employee> al){
		al.add(new Employee(12,29,"ankit","dev"));
		al.add(new Employee(5,25,"deepak","hr"));
		al.add(new Employee(19,32,"santosh","hr"));
		al.add(new Employee(8,28,"yusuf","test"));
		al.add(new Employee(4,27,"ramesh","hr"));
		al.add(new Employee(18,26,"vinod","sales"));
		al.add(new Employee(3,25,"deepak","dev"));
		al.add(new Employee(1,28,"yusuf","sales"));
		al.add(new Employee(16,27,"ramesh","test"));
	}
	public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<>();
	EmployeeMain e=new EmployeeMain();
	e.addEle(al);
	System.out.println("--------Before Sorting-----\n"+al);
	Collections.sort(al);
	
	System.out.println("------After Sorting------\n"+al);
	}

}
