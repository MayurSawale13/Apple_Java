package strings;

import java.util.Arrays;

public class Odd {

	public static void main(String[] args) {
		//       0 1 2    4    5    
		int a[]={1,6,2,3,8,10};
		int left=0;int right=a.length-1;
		while(left<right){
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
