package map_assignment;

import java.util.HashMap;
import java.util.Map;

/*7.Create a Map which contain Integer as key and Another Map 
as Value another Map Contain String as Key and Integer 
as value print the Map using Iterator.*/
public class AnotherMapAsValue {

	public static void main(String[] args) {
	
		
		HashMap<Integer,HashMap<String,Item> >hm=new HashMap<>();
		
		HashMap<String,Item>hm1=new HashMap<>();
		HashMap<String,Item>hm2=new HashMap<>();
		HashMap<String,Item>hm3=new HashMap<>();
		hm1.put("avail", new Item(15, "shoe", 3, 20));
		hm1.put("Not avail", new Item(20, "furniture", 1, 200000));
		hm2.put("avail", new Item(10, "mobile", 2, 15000));
		hm2.put("Not avail", new Item(98, "grain", 1, 7020));
		hm2.put("may be", new Item(26, "wheat", 3, 1050));
		hm3.put("avail", new Item(22, "rice", 3, 510));
		hm3.put("Not avail", new Item(17, "fridge", 1, 17020));
		hm3.put("may be", new Item(16, "Parle G", 3, 20));
		hm.put(1, hm1);
		hm.put(2, hm2);
		hm.put(3, hm3);
	for(Map.Entry<Integer,HashMap<String,Item>> ent:hm.entrySet()){
		System.out.println(ent.getKey());
		for(Map.Entry<String, Item> it:ent.getValue().entrySet()){
			System.out.println(it.getKey()+" "+it.getValue());
		}
	}
	}

}
