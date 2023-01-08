package list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList_Viceversa {

	public static void main(String[] args) {
		int a[]={1,9,65,25,30};
		Integer a2[]={1,9,65,25,30};
		//converting array to arrayList
		//1.from primitive data type arry to arrayList 
		ArrayList<Integer> a1=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			a1.add(a[i]);
		}
		System.out.println(a1);
		//2.from object data type array to arrayList
		ArrayList<Integer> b2=new ArrayList<>(Arrays.asList(a2));
		System.out.println(b2);
		
		
		//Converting from ArrayList to Array:
		//1.using object class:
		Object b1[]=a1.toArray();
		int c1[]=new int[a1.size()];
		for(int x:c1)
		{
			c1[x]=a1.get(x);
		}
		System.out.println(Arrays.toString(c1));
		
	}

}
