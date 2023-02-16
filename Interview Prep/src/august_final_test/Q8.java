package august_final_test;

import java.util.Arrays;

/*An IMEI number/ International Mobile Station Equipment Identity is a 15 
digit number and it is said to be IMEI number if and
only if the sum of the number is exactly divisible by 10.*/
public class Q8 {

	void imeicheck(int a[]){
		for(int i=0;i<a.length;i++){
			if(i%2!=0){
				a[i]=a[i]*2;
			}
		}
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>9){
				while(a[i]>0){
				int r=a[i]%10;
				sum+=r;
				a[i]=a[i]/10;
				}
			}
			else
				sum+=a[i];
		}
		System.out.println(Arrays.toString(a));
		if(sum%10==0)
			System.out.println("IMEI is valid");
		else
			System.out.println();
	}
	public static void main(String[] args) {
		int a[]={4,9,0,1,5,4,2,0,3,2,3,7,5,1,8 };
		Q8 s=new Q8();
		s.imeicheck(a);
	}

}
