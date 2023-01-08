package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		//Mostly same as arrayList but use LinkedList insted of dynamic array data structure.
		LinkedList <Integer> num=new LinkedList<>();
		num.add(25);
		num.add(15);
		num.add(10);
		num.add(5);
		num.add(30);
		num.add(10);
		num.add(15);
		num.add(45);
		num.add(30);
		//add @First index
		num.addFirst(5);
		//add @ last Index
		num.addLast(50);
			
		//Collection Methods:
		Collections.sort(num);
		Collections.reverse(num);
		System.out.println(num);
		//Backward iterating using descendingIterator:only with LinkedList

		Iterator<Integer> it=num.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//remove duplicate 
		/*LinkedList <Integer> num1=new LinkedList<>();
		for(Integer i:num)
		{
			if(!num1.contains(i))
			{
				num1.add(i);
			}
		}
		System.out.print(num1);*/
		
		//find freq of element:
		int count=0;
		while(it.hasNext())
		{
			if(it.next()==10)
			{
				count++;
			}
		}
		System.out.println("\nfreq of 10:"+count);
	}

}
