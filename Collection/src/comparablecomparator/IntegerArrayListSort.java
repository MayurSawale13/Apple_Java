package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegerArrayListSort {
	void addEle(ArrayList<Integer> al1){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			al1.add(sc.nextInt());
		}
		
	}
	void sort(ArrayList<Integer> al1)
	{
		Collections.sort(al1);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		IntegerArrayListSort s=new IntegerArrayListSort();
		s.addEle(al);
		System.out.println(al);
		s.sort(al);
		System.out.println(al);
		
	}
}
