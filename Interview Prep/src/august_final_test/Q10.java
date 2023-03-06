package august_final_test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*10.Write a program to merge two sorted array of number such that
new array is sorted array and there should be no duplicate in new array.*/
public class Q10 {
	void merge(int a[],int b[]){
		int k=0;
		int j=0;
		int i=0;
		int c[]=new int[a.length+b.length];
		
		while(i<a.length){
			c[k++]=a[i++];
		}
		while(j<b.length){
			c[k++]=b[j++];
		}
		Set<Integer> removeduplicate=new HashSet<>();
		for(int i1=0;i1<c.length;i1++){
			removeduplicate.add(c[i1]);
		}
		int d[]=new int [removeduplicate.size()];
		int n=0;
		Iterator<Integer>itr=removeduplicate.iterator();
		while(itr.hasNext()){
			d[n]=itr.next();
			n++;
		}
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
	}

	public static void main(String[] args) {
		Q10 m=new Q10();
		int a[]={10,20,15,35,30};
		int b[]={40,5,14,15,30};
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		m.merge(a, b);
	}

}
