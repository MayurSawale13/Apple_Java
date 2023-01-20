package map_assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*3.Write a Java program to get a set of keys contained in map 
and print whole map using iterator and for each loop.*/
public class TraverseMap {

	public static void main(String[] args) {
		HashMap<Integer,String> s=new HashMap<>();
		s.put(5, "Akhil");
		s.put(98, "Sachin");
		s.put(54, "Reetu");
		s.put(10, "Gita");
		s.put(15, "faruq");
		s.put(9, "Punit");
		System.out.println("Set of keys in Map:"+s.keySet());
		for(Map.Entry<Integer,String> me:s.entrySet()){
			System.out.println(me);
		}
		System.out.println("\n");
		Iterator<Map.Entry<Integer,String>> it=s.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
