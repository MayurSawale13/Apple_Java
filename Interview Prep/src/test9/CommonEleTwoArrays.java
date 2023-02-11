package test9;

public class CommonEleTwoArrays {

	public static void main(String[] args) {
		int a[]={12, 23, 34, 67 ,78, 91, 56};
		int b[]={12, 25, 12, 23, 55, 91,66, 22};
		for(int i=0;i<a.length;i++){
			int c=1;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j] && a[j]!=0){
					
					c++;
					a[j]=0;
				}
				
			}
			if(c>1 && a[i]!=0)
				System.out.println(a[i]);
		}
	}

}
