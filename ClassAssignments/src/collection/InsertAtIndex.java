package collection;

import java.util.ArrayList;

public class InsertAtIndex {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<50;i++)
		{ 
			a.add(i);
			i=i+5;
		}
		System.out.println("Before adding:"+a);
		a.add(6,15);
		System.out.println("Before adding:"+a);

	}

}
