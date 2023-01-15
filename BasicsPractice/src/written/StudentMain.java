package written;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain  {
	void addStudent(ArrayList<Student> al){
		al.add(new Student(12,19,"Akhil"));
		al.add(new Student(16,20,"Balaji"));
		al.add(new Student(8,24,"Camela"));
		al.add(new Student(6,22,"Santosh"));
		al.add(new Student(7,17,"Zeeshan"));
		al.add(new Student(10,23,"Mayur"));
	}

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		StudentMain s=new StudentMain();
		s.addStudent(al);
		System.out.println("Current ArrayList");
		System.out.println(al);
		System.out.println("----Sorting based on Roll no-----" );
		Collections.sort(al, new RollNoSort());
		System.out.println(al);
		System.out.println("-----Sorting based on Age-----");
		Collections.sort(al, new AgeSort());
		System.out.println(al);
		System.out.println("-----Sorting based on Name-----");
		Collections.sort(al, new NameSort());
		System.out.println(al);
	}

}
