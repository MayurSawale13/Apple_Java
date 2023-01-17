package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeMain {
	void addEmp(ArrayList<Employee> al1) {
		al1.add(new Employee(14, "mayur", "dev", new Profile("MH", "India")));
		al1.add(new Employee(7, "zack", "sales", new Profile("texas", "Germany")));
		al1.add(new Employee(9, "emma", "hr", new Profile("London", "England")));
		al1.add(new Employee(20, "mayur", "Testing", new Profile("Paris", "India")));
	}
	void createHashMap(ArrayList<Employee> al,HashMap<String ,Integer> hm)
	{
		for(Employee s:al)
		{
			String c=s.p.country;
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
				hm.put(c, 1);
		}
	}
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		EmployeeMain e = new EmployeeMain();
		e.addEmp(al);
		
		HashMap<String ,Integer> hm=new HashMap<>();
		e.createHashMap(al, hm);
		System.out.println(hm);
	}
}
