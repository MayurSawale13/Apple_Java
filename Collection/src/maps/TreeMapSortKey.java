package maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapSortKey {
	void createHash(TreeMap<Student,Integer> tm){
		tm.put(new Student(15,"mayur","cs",75),16);
		tm.put(new Student(17,"shiv","civil",67),36);
		tm.put(new Student(24,"ankita","ec",87),9);
		tm.put(new Student(11,"ankit","cs",63),8);
		tm.put(new Student(19,"kamleh","mech",80),6);
		tm.put(new Student(23,"ramesh","civil",65),12);
		tm.put(new Student(23,"kamlesh","civil",65),12);
	}

	public static void main(String[] args) {
		TreeMap<Student,Integer> tm=new TreeMap<>(new StudentNameSort());
		TreeMapSortKey m=new TreeMapSortKey();
		m.createHash(tm);
		System.out.println(tm);

	}

}
