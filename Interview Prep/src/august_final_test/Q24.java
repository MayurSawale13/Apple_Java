package august_final_test;

import java.util.LinkedHashMap;

/*24.Create a Map<String,String> where key is 
adharno and value is voted casted to
Which party (eg. BJP,ShivSena,NCP,Congress,Other).
From this create new map such That KEY is party
name and value is count of votes casted.*/
public class Q24 {
	void addEle(LinkedHashMap<String, String> lh) {
		lh.put("1278 1234 7874", "BJP");
		lh.put("1278 1234 7896", "NCP");
		lh.put("1245 1234 7895", "Congress");
		lh.put("1278 1234 7897", "BJP");
		lh.put("1278 1234 7884", "NCP");
		lh.put("1278 1234 7882", "BJP");
		lh.put("1278 1234 7885", "Congress");
		lh.put("1278 1234 7876", "BJP");
		lh.put("1278 1234 7832", "NCP");

	}

	void voteCount(LinkedHashMap<String, String> lh, LinkedHashMap<String, Integer> vc) {

		for (String s : lh.values()) {
			if (vc.containsKey(s)) {
				vc.put(s, vc.get(s) + 1);
			} else
				vc.put(s, 1);
		}

	}

	public static void main(String[] args) {
		LinkedHashMap<String, String> lh = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> vc = new LinkedHashMap<>();
		Q24 v = new Q24();
	
		v.addEle(lh);
		System.out.println(lh);
		v.voteCount(lh, vc);
		System.out.println(vc);
	}

}
