package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListD {
public static void main(String[] args) {
	Integer a[]={1,8,9,4,6};
	ArrayList <Integer>al=new ArrayList<>(Arrays.asList(a));
	Collections.swap(al, 0, al.size()-1);
//	Collections.reverse(al);

	System.out.println(al);
}
}
