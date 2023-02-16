package august_final_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*13.Given two LinkedList, we need to combine two LinkedList in such a way
that the combined aList has alternate elements of both. 
If one list has extra element, then these elements are appended
at the end of the combined list.[1M]

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}*/
public class Q13 {
	void output(List<Integer>al1,List<Integer>al2){
		ArrayList<Integer>al3=new ArrayList<>();
		for(int i=0;i<al1.size();i++){
			if(i<al1.size())
				al3.add(al1.get(i));
			if(i<al2.size())
				al3.add(al2.get(i));
		}
		System.out.println(al3);
	}

	public static void main(String[] args) {
		Q13 l=new Q13();
		List<Integer>al1=Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer>al2= Arrays.asList(11, 22, 33, 44);
		l.output(al1, al2);

	}

}
