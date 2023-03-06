package august_final_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*21.WAP to create a 2D array of 4 X  4. Create a List from array such 
that it contains only 
lower Triangular matrix elements and print list in sorted order.[1M]*/
public class Q21 {
	void lowerTri(int a[][]){
		ArrayList<Integer>al =new ArrayList<>();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i>j){
					al.add(a[i][j]);
				}
			}
		}
		Collections.sort(al);
		System.out.println(al);
	}

	public static void main(String[] args) {
		Q21 l=new Q21();
		int a[][]={{1,5,9,8},
				   {5,4,9,2},
				   {7,3,4,6},
				   {2,8,5,3}};
		
		l.lowerTri(a);

	}

}
