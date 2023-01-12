package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class FacultyMain {
	void addFaculty(ArrayList<Faculty> al1)
	{
		al1.add(new Faculty(12,60000,"java","cs"));
		al1.add(new Faculty(05,69000,"microprocceser","ec"));
		al1.add(new Faculty(65,80000,"mod","mech"));
		al1.add(new Faculty(10,60000,"python","cs"));
	}
	
	

	public static void main(String[] args) {
		ArrayList<Faculty> al=new ArrayList<>();
		FacultyMain f=new FacultyMain();
		f.addFaculty(al);
		System.out.println(al);
		Collections.sort(al, new FacultySort());
		System.out.println("---after sorting with dept(salary,subject)\n"+al);

	}

}
