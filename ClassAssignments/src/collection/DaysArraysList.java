package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DaysArraysList {

	public static void main(String[] args) {
		ArrayList<String> days=new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");

  Iterator<String> s=days.iterator();
  while(s.hasNext())
  {      
	  if(s.next().length()>7)
	  {
		  s.remove();
	  }
  }
  System.out.println(days);
		
	}

}
