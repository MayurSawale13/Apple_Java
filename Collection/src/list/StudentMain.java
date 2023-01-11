package list;

import java.util.ArrayList;

public class StudentMain {
	
	 static ArrayList<Student> al = new ArrayList<>();
	
	void display() {
		
		for(Student s:al)
		{
			float total=0;
			float percentage=0;
			for(int i:s.marks)
			{
				 total=total+i; 
				 percentage = total/s.marks.size();
			}
			
			System.out.println(s.name+" "+percentage+" "+s.dept);
		}
		
		
	}
	

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(85);
		a1.add(78);
		a1.add(89);
		a1.add(74);
		
		al.add( new Student(10,"Jack","ME",a1));
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(85);
		a2.add(88);
		a2.add(78);
		a2.add(77);
		
		al.add( new Student(11,"Mayur","CS",a2));
		
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(78);
		a3.add(58);
		a3.add(98);
		a3.add(88);
		
		al.add( new Student(12,"Amit","CE",a3));
		
		ArrayList<Integer> a4 = new ArrayList<>();
		
		a4.add(75);
		a4.add(65);
		a4.add(70);
		a4.add(85);
		
		al.add( new Student(13,"Vishakha","EC",a4));
		
		StudentMain m = new StudentMain();
		m.display();
		
	}
}