package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> s=new HashMap<>();
		s.put(5, "Akhil");
		s.put(98, "Sachin");
		s.put(54, "Reetu");
		s.put(10, "Gita");
		s.put(15, "faruq");
		s.put(9, "Punit");
		System.out.println(s);
		LinkedHashMap<Integer,String> s1=new LinkedHashMap<>();
		s1.put(5, "Akhil");
		s1.put(98, "Sachin");
		s1.put(54, "Reetu");
		s1.put(10, "Gita");
		s1.put(15, "faruq");
		s1.put(9, "Punit");
		System.out.println(s1);
		TreeMap<Integer,String> s2=new TreeMap<>();
		s2.put(5, "Akhil");
		s2.put(98, "Sachin");
		s2.put(54, "Reetu"); 
		s2.put(10, "Gita");
		s2.put(15, "faruq");
		s2.put(9, "Punit");
		System.out.println(s2);
	}

}
