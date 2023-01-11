package comparablecomparator;

import java.util.Comparator;

public class EmployeeNameSort implements Comparator<Employee> {

	public int compare(Employee e1,Employee e2)
	{
		if(e1.name.compareTo(e2.name)==0)
		{
			if(e1.salary>e2.salary)
				return 1;
			else if(e1.salary<e2.salary)
				return -1;
			else
				return 0;
		}
		return e1.name.compareTo(e2.name);
	}
}
