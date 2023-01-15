package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListMapIterator {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
		al.add('a');
		al.add('h');
		al.add('f');
		al.add('a');
		al.add('f');
		al.add('c');
		al.add('f');
		al.add('a');
		al.add('f');
		al.add('h');

		HashMap<Character, Integer> hm = new HashMap<>();
		/*
		 * for(Character c:al) { 
		 * if(hm.containsKey(c)) 
		 * { int i=hm.get(c); 
		 * i=i+1;
		 * hm.put(c, i); 
		 * } else 
		 * { 
		 * hm.put(c, 1); 
		 * } 
		 * } System.out.println(hm);
		 */
		ArrayList<Character> d = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			Character f = al.get(i);
			int count = 1;
			for (int j = i + 1; j < al.size(); j++) {

				if (f.equals(al.get(j))) {
					
					
					d.add(al.get(j));
					count++;
					if(count==2)
					{
						d.add(f);
					}
					al.set(j, '\0');
				}
				
			}
			
			if (f != '\0') {
				hm.put(f, count);
			}
		}
		System.out.println(hm);
		System.out.println(d);
		
		
	}

}
