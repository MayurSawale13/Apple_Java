package august_final_test;

import java.util.LinkedList;
import java.util.Stack;

public class Q15 {
	void reverse(LinkedList<Integer>ll){
		System.out.println(ll);
		Stack<Integer> s=new Stack<>();
		for(int i=ll.size()-1;i>=0;i--){
			s.push(ll.get(i));
		}
		System.out.println("Stack (reverse): "+s);
	}

	public static void main(String[] args) {
		Q15 copy=new Q15();
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(50);
		ll.add(20);
		ll.add(10);
		ll.add(60);
		ll.add(40);
		copy.reverse(ll);

	}

}
