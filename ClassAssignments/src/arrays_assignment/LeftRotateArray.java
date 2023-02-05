package arrays_assignment;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {
		int a[]={1,6,8,7,4,5,6,9};
		int temp[]=new int[a.length];
		int d=3;
		System.out.println(Arrays.toString(a));
		int k=0;
		for(int i=d;i<a.length;i++){
			temp[k]=a[i];
			k++;
		}
		for(int i=0;i<d;i++){
			temp[k]=a[i];
			k++;
		}
		for(int i=0;i<a.length;i++){
			a[i]=temp[i];
		}
		System.out.println(Arrays.toString(a));
	}

}
