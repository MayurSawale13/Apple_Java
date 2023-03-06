
public class Array {
	public static void main(String[] args) {
		int a[]={6,5,4,2,7};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max2=max;
				max=a[i];
			}
			else if(max2<a[i] && a[i]<max )
				max2=a[i];
		}
		for(int i=0;i<a.length;i++){
			if(a[i]<max2)
				sum+=a[i];
		}
		System.out.println(max);
		System.out.println(max2);
		System.out.println(sum);
	}


}
