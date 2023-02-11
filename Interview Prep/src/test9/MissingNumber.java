package test9;
/*Write a program to print missing numbers in a sequence of numbers
 input :{1,2,4,5,7,8,9,12,15}*/
public class MissingNumber {

	public static void main(String[] args) {
		int a[]={1,2,4,5,7,8,9,12,15};
		int j=1;
		for(int i=0;i<a.length;i++){
		
			if(a[i]!=j){
				System.out.print(j+" ");
				i--;
			}
			j++;
		}

	}

}
