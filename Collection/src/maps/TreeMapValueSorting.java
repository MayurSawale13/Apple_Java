package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapValueSorting {
	void createHash(TreeMap<Integer,Student>hm){
		hm.put(12,new Student(15,"mayur","cs",75));
		hm.put(7,new Student(7,"shiv","civil",67));
		hm.put(9,new Student(24,"ankita","ec",87));
		hm.put(8,new Student(11,"ankit","cs",63));
		hm.put(16,new Student(19,"kamlesh","mech",80));
		hm.put(1,new Student(3,"ramesh","civil",65));
		hm.put(12,new Student(168,"kamlesh","civil",65));
	}
	void sortTreeMap(TreeMap<Integer,Student>hm){
		ArrayList<Student>al=new ArrayList<>();
		for(Student s: hm.values())
		{
			al.add(s);
		}
		
		Collections.sort(al, new StudentNameSort());
		System.out.println(al);
		LinkedHashMap <Integer,Student>lh=new LinkedHashMap<>();
		for(Student s:al)
		{
			int key=0;
			for(Map.Entry<Integer, Student> ent:hm.entrySet())
			{
				if(s.name.equalsIgnoreCase(ent.getValue().name))
				{
					key=ent.getKey();
					if(!lh.containsKey(key))
					{
						lh.put(key, s);
					}
				}
			}
		}
		System.out.println(lh);
	}
	public static void main(String[] args) {
		TreeMap<Integer,Student>tm=new TreeMap<>();
		TreeMapValueSorting t=new TreeMapValueSorting();
		t.createHash(tm);
		t.sortTreeMap(tm);
		System.out.println(tm);
	}

}
