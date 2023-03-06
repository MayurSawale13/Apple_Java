package august_final_test;
/*19.Create a class project (projectId,projectName,Student sarr[]) 
.Each project has max 3 student .WAP to create and accept data in array 
of project and display the projectwise student details
(All fields in project class are private use gettters/setters). [1M]*/
import java.util.ArrayList;

public class Q19 {
	void setDetails(ArrayList<Project> al) {
		Project p1 = new Project();
		Student sarr1[] = new Student[3];
		sarr1[0] = new Student(101, 650);
		sarr1[1] = new Student(105, 850);
		sarr1[2] = new Student(104, 550);
		p1.setPid(1);
		p1.setPname("cloud system");
		p1.setSarr(sarr1);
		al.add(p1);
		Project p = new Project();
		Student sarr2[] = new Student[3];
		sarr2[0] = new Student(110, 480);
		sarr2[1] = new Student(110, 520);
		sarr2[2] = new Student(110, 656);
		p.setPid(2);
		p.setPname("queue system");
		p.setSarr(sarr2);
		al.add(p);
	}

	void display(ArrayList<Project> al) {
		for (Project x : al) {
			System.out.println(x.getPid() + "-" + x.getPname());
			for (Student s : x.getSarr()) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		Q19 p = new Q19();
		ArrayList<Project> al = new ArrayList<>();
		p.setDetails(al);
		p.display(al);
	}

}
