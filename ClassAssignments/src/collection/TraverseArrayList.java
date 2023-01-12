package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class TraverseArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> num=new ArrayList<>();
		num.add(25);
		num.add(15);
		num.add(10);
		num.add(5);
		num.add(30);
		num.add(10);
		num.add(15);
		num.add(45);
		num.add(30);

		System.out.println("===travrse using for loop===");
		for(Integer i:num)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===reverse traversing using listIteraror===");
		ListIterator <Integer> li=num.listIterator(num.size());
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("====reversing ArrayList=====");
		System.out.println(num);
		Collections.reverse(num);
		System.out.println(num);
		
		System.out.println("===getting sublist===");
		System.out.println(num.subList(3, 9));
		
	}

}
