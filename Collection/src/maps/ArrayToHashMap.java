package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayToHashMap {
	void add(ArrayList<Integer> al){
		al.add(1);
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(4);
		
	}
   void create(HashMap<String,Integer> hm,ArrayList<Integer> al){
	   for(Integer i:al){
	   String s="";
	   switch(i){
	   case 1:s="one";
	   		break;
	   case 2:s="two";
	   		break;
	   case 3:s="three";
	   	break;
	   case 4:s="four";
		   break;
	   }
	   if(hm.containsKey(s))
	   {
		   hm.put(s, hm.get(s)+1);
	   }
	   else{
		   hm.put(s, 1);
	   }
	   }
	   
	   
   }
	public static void main(String[] args) {
		ArrayToHashMap n=new ArrayToHashMap();
		ArrayList<Integer> al = new ArrayList<>();
		
		HashMap<String,Integer>hm=new HashMap<>();
		n.add(al);
		n.create(hm, al);
		
	}

}
