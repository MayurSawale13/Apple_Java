package array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
	int a[]={1,2,3,4,5,6};
	int b[]={10,20,30};
	int c[]=new int [a.length+b.length];
	int k=0;
	for(int i=0;i<a.length;i++){
		if(i<a.length){
			c[k]=a[i];
			k++;
		}
		if(i<b.length){
			c[k]=b[i];
			k++;
		}
	}
System.out.println(Arrays.toString(c));
	}

}
