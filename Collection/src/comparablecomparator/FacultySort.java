package comparablecomparator;

import java.util.Comparator;

public class FacultySort implements Comparator<Faculty> {

	

	
	public int compare(Faculty o1, Faculty o2) {
		if(o1.dept.compareTo(o2.dept)==0)
		{
			if(o1.salary>o2.salary)
				return 1;
			else if(o1.salary<o2.salary)
				return -1;
			else
			{
				if(o1.id>o2.id)
					return 1;
				else if(o1.id<o2.id)
					return -1;
				else
					return 0;
				
			}
		}
		else
			return o1.dept.compareTo(o2.dept); 
		}
			
		
	}


