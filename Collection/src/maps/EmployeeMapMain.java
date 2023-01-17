package maps;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapMain {
	void createHashmap(HashMap<Integer,Employee> hm)
	{
		hm.put(1, new Employee(14, "mayur", "dev", new Profile("MH", "India")));
		hm.put(6, new Employee(12, "akhil", "test", new Profile("KA", "India")));
		hm.put(8, new Employee(18, "mahesh", "IT", new Profile("andhra", "India")));
		hm.put(7, new Employee(24, "ganesh", "hr", new Profile("paris", "france")));
		hm.put(4, new Employee(32, "jennifer", "sales", new Profile("texas", "usa")));
		hm.put(9, new Employee(13, "zeeshan", "support", new Profile("delhi", "India")));
		hm.put(11, new Employee(29, "yakub", "dev", new Profile("goa", "India")));
		
	}
	void display(HashMap<Integer,Employee> hm)
	{
		for(Map.Entry<Integer,Employee> emp:hm.entrySet())
		{
			if(emp.getValue().name.startsWith("m"))
				System.out.println(emp);
		}
	}
	

	public static void main(String[] args) {
		HashMap<Integer,Employee> hm=new HashMap<>();
		EmployeeMapMain e=new EmployeeMapMain();
		e.createHashmap(hm);
		e.display(hm);
	

	}

}
