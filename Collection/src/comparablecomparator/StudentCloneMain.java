package comparablecomparator;

import java.util.ArrayList;

public class StudentCloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Integer> m=new ArrayList<>();
		m.add(50);
		m.add(65);
		m.add(70);
		m.add(90);
		m.add(36);

		Student s1=new Student("mayur",m);
		
		Student s2=(Student) s1.clone();//only copies object
		m.add(50);
		m.add(100);
		System.out.println("---shallow copy---");
		
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
		
	/*	System.out.println("---deep copy---");
		Student s2=(Student) s1.clone();
		m.add(100);
		m.add(200);
		System.out.println("s1 "+s1);
		System.out.println("s2: "+s2);		*/
	}

}
