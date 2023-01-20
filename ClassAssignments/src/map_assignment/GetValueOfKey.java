package map_assignment;

import java.util.HashMap;

/*2.Write a Java program to get the value of a specified key 
in a map.*/
public class GetValueOfKey {

	public static void main(String[] args) {
		HashMap<Integer,String> s=new HashMap<>();
		s.put(5, "Akhil");
		s.put(98, "Sachin");
		s.put(54, "Reetu");
		s.put(10, "Gita");
		s.put(15, "faruq");
		s.put(9, "Punit");
		System.out.println();
		System.out.println("Value of Key:"+s.get(10));
		System.out.println("Key Of value:"+s.getOrDefault(10,null));
	}

}
