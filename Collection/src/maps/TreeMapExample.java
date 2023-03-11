package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	void createHash(TreeMap<Integer,String>hm){
		hm.put(16,"mayur");
		hm.put(36,"shiv");
		hm.put(9,"ankita");
		hm.put(8,"ankit");
		hm.put(6,"Kamlesh");
		hm.put(12,"ramesh");
		hm.put(13,"Kamlesh");
	}
	public static void main(String[] args) {
		TreeMap<Integer,String>tm=new TreeMap<>();
		TreeMapExample t=new TreeMapExample();
		t.createHash(tm);
		//System.out.println(tm.firstEntry());
		//tm.remove(tm.firstKey());
		for(Map.Entry<Integer,String> c:tm.entrySet())
		{
			System.out.print(c+" ");
		}
		System.out.println("First key:"+tm.firstKey());
		System.out.println("Last key:"+tm.lastKey());
		System.out.println("First Entry:"+tm.firstEntry());
		System.out.println("Last Entry:"+tm.firstEntry());
		System.out.println("Floor key:"+tm.floorKey(15));
		System.out.println("Ceiling Key:"+tm.ceilingKey(15));
		System.out.println("Floor Entry:"+tm.floorEntry(15));
		System.out.println("Ceiling Entry:"+tm.ceilingEntry(15));
		System.out.println("Tailor map:"+tm.tailMap(15,true));
		System.out.println("Tailor map:"+tm.tailMap(15,false));
		System.out.println("Sub map without last entry:"+tm.subMap(6, 16));
		System.out.println("Sub map without first entry:"+tm.subMap(6,false, 16,true));
	}

}
