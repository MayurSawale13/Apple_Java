package august_final_test;

import java.util.LinkedHashSet;

/*23.Create two Set of students objects where insertion order in 
maintained. Now accept Studentid from user and check whether in both
sets have student with given id at same position. [1M]*/
public class Q23 {
	 void createSet(LinkedHashSet<Student> s1,LinkedHashSet<Student> s2){
		 s1.add(new Student(101,650));
		 s1.add(new Student(102,850));
		 s1.add(new Student(106,950));
		 s2.add(new Student(101,750));
		 s2.add(new Student(105,750));
		 s2.add(new Student(109,850));
	 }
	 void search(LinkedHashSet<Student> s1,LinkedHashSet<Student> s2){
		 int id=101;
		 for(Student x:s1){
			 for(Student x1:s2){
				 if(x.sid==id && x1.sid==id)
					 System.out.print(x+" "+x1);
			 }
		 }
	 }
	public static void main(String[] args) {
		Q23 s=new Q23();
		LinkedHashSet<Student> s1=new LinkedHashSet<>();
		LinkedHashSet<Student> s2=new LinkedHashSet<>();
		s.createSet(s1, s2);
		s.search(s1, s2);
	}

}
