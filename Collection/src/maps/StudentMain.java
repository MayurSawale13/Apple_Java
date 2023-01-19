package maps;

import java.util.HashMap;

public class StudentMain {
	void createHash(HashMap<Student,Integer> hm){
		hm.put(new Student(15,"mayur","cs",75),16);
		hm.put(new Student(17,"shiv","civil",67),36);
		hm.put(new Student(24,"ankita","ec",87),9);
		hm.put(new Student(11,"ankit","cs",63),8);
		hm.put(new Student(19,"Kamleh","mech",80),6);
		hm.put(new Student(23,"ramesh","civil",65),12);
		hm.put(new Student(23,"Kamlesh","civil",65),12);
	}

	public static void main(String[] args) {
		HashMap<Student,Integer> hm=new HashMap<>();
		StudentMain m=new StudentMain();
		m.createHash(hm);
		System.out.println(hm);

	}

}
