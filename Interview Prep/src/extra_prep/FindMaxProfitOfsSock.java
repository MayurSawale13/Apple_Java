package extra_prep;

import java.util.Arrays;

public class FindMaxProfitOfsSock {

	public static void main(String[] args) {
		int a[]={10,3,4,9,12};
		int p[]=new int[10];
		int k=0;
		for(int i=0;i<a.length;i++){
			int diff=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					diff=a[j]-a[i];
					p[k++]=diff;
				}
			}
			
		}
		int max=0;
		for(int i=0;i<p.length;i++){
			if(p[i]>max){
				max=p[i];
			}
		}
		System.out.println("Max profit: "+max );
	}

}
