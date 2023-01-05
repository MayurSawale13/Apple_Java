package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodsOfArrayList1 {

	public static void main(String[] args) {
		String h[]={"Hi","this","Array","not","List"};
		//Ways to store array into collection
		
		//1.Array.asList Method for List
		List <String> a= Arrays.asList(h);
		//2.Using ArrayList Constructor
		ArrayList <String> a1= new ArrayList<>(Arrays.asList(h));
		//3.Using addAll method of Collection utility
		ArrayList <String> phrase=new ArrayList<>();
		Collections.addAll(phrase,h);
	
		
		//Ways to convert collection into Array:
	
		//1.Using Object Array
		Object arr[]=a1.toArray();
		System.out.println(Arrays.toString(arr));
		//2.Using normal array:
		String s[]=new String[a.size()];
		a.toArray(s);
		System.out.println(Arrays.toString(s));
		
		//Traverse throu to check output
		for(String t:a1)
			System.out.println(t);
	}

}
