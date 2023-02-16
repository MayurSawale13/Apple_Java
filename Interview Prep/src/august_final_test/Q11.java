package august_final_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/*11.Consider an ArrayList<Test>and  test has  {tid,sid,marks} .
Create a Set<Student> Student{sid,totalmarks}  
from the list and sort the set in descending order of totalmarks. [2M]*/
public class Q11 {
	
		void createList(ArrayList<Student> al){
			al.add(new Student(11,90));
			al.add(new Student(10,50));
			al.add(new Student(11,70));
			al.add(new Student(13,95));
			al.add(new Student(12,80));
			
		}
		void createSet(TreeSet<Test> ts,ArrayList<Student> al){
			int k=101;
			for(Student x:al){
				ts.add(new Test(k,x.sid,x.total_marks));
				k++;
			}
		
			System.out.println("Sorted descending Marks:"+ts);
		}
	public static void main(String[] args) {
		Q11 t=new Q11();
		ArrayList<Student> al=new ArrayList<>();
		TreeSet<Test> ts=new TreeSet<Test> ();
		t.createList(al);
		t.createSet(ts, al);
	}

}
