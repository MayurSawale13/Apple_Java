package written;

import java.util.Comparator;

public class ProfileSort implements Comparator<Employee> {
	public int compare(Employee p1,Employee p2)
	{
		return p1.p.country.compareTo(p2.p.country);
	}

}
