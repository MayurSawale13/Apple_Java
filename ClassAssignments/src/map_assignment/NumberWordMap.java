package map_assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*5.Create a hashmap <Integer,String> where key is integers 
1 to 10 and string is number in Words. 
Remove entry for which number is divisible by 3.*/
public class NumberWordMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"one");
		hm.put(2,"two");
		hm.put(3,"three");
		hm.put(4,"four");
		hm.put(5,"five");
		hm.put(6,"six");
		hm.put(7,"seven");
		hm.put(8,"eight");
		hm.put(9,"nine");
		hm.put(10,"ten");
		Iterator<Map.Entry<Integer,String>>itr=hm.entrySet().iterator();
		while(itr.hasNext()){
			if(itr.next().getKey()%3==0){
				itr.remove();
			}
		}
		System.out.println("After removing : "+hm);
	}

}
