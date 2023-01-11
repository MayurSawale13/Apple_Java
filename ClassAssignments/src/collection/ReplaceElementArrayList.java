package collection;

import java.util.ArrayList;

public class ReplaceElementArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<50;i++)
		{ 
			a.add(i);
			i=i+3;
		}
		System.out.println("Before replacing:"+a);
		a.set(4, 50);
		System.out.println("after replacing");
		System.out.println(a);

	}

}
