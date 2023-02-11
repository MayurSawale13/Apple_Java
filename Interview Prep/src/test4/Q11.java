package test4;

public class Q11 {

	public static void main(String[] args) {
		int a[][]={{5,6,3},
				{9,5,7},
				{8,4,1}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i==0 || i==a.length-1 || j==0 || j==a.length-1)
						System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
