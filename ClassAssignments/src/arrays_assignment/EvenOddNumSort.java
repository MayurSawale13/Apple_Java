package arrays_assignment;

import java.util.Arrays;

public class EvenOddNumSort {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int left=0,right=a.length-1;
		while(left<right)
		{
			while(a[left]%2==0 && left<right)
				left++;
			while(a[right]%2!=0 && left<right)
				right--;
			if(left<right){
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
	
System.out.println(Arrays.toString(a));
	}

}
