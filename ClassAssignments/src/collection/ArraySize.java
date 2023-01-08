package collection;

import java.util.ArrayList;

public class ArraySize {

	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<>();
		System.out.println("Size Of arrayList Before adding elemenets:"+a.size());
		int j=1;
		for(int i=0;i<=11;i++)
		{
			
			a.add(j);
			j++;
		}
		System.out.println(a);
		System.out.println("Size After Adding element:"+a.size());
		

	}

}
