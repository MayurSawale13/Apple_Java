package map_assignment;
/*1.Write a Java program to test if a map contains a mapping for 
the specified value and also test if a map contains a mapping 
for the specified key.*/

import java.util.HashMap;

public class MappingKeyValue {

	public static void main(String[] args) {
		HashMap<Integer,String> s=new HashMap<>();
		s.put(5, "Akhil");
		s.put(98, "Sachin");
		s.put(54, "Reetu");
		s.put(10, "Gita");
		s.put(15, "faruq");
		s.put(9, "Punit");
		
		System.out.println("Mapping of Key:"+s.get(5));
		System.out.println("Mapping of value:"+s.containsValue("Akhil"));

	}

}
