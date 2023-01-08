package list;

import java.util.ArrayList;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sun");
		al.add("Mon");
		 al.add("Sat");
		 al.add("Sun");
		 al.add("Mon");
		 al.add("Sat");
		 al.add("Sun");
		al.add("Sat");
		 al.add("Sun");
		 al.add("Mon");
		 ArrayList<String> alnew = new ArrayList<String>(); 
		 for(String s:al)
		 {
			 if(!alnew.contains(s))
			 {
				 alnew.add(s);
			 }
		 }
		 System.out.println(alnew);

	}

}
