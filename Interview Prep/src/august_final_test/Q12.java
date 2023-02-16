package august_final_test;

import java.util.ArrayList;
import java.util.HashMap;

/*12.Assume that there is already  arraylist of members of Society 
Member{memberid,Wing_flatNo,name}.  Write a program which 
creates Map where key
is Wing_FlatNo and value is List of all  names of family members [1M]*/
public class Q12 {
	void createList(ArrayList<S_Members> al) {
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("akhil");
		names1.add("ayushi");
		al.add(new S_Members(1, "A-101", names1));
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("suyesh");
		names2.add("janvi");
		al.add(new S_Members(1, "B-106", names2));
		ArrayList<String> names3 = new ArrayList<String>();
		names3.add("cyrus");
		names3.add("amira");
		al.add(new S_Members(1, "A-102", names3));
		System.out.println(al);
	}

	void createMap(HashMap<String, ArrayList<String>> hm, ArrayList<S_Members> al) {
		for (S_Members x : al) {
			hm.put(x.wing_flatNo, x.names);
		}
		System.out.println(hm);
	}

	public static void main(String[] args) {
		Q12 map = new Q12();
		ArrayList<S_Members> al = new ArrayList<>();
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		map.createList(al);
		map.createMap(hm, al);
	}

}
