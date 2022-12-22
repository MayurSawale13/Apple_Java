package arrays2d;

public class MinColEle {

	public static void main(String[] args) {
		int a[][] = {{22, 31, 9}, {12, 25, 16}};
		
		for(int i=0;i<3;i++)
		{
			int min=a[0][i];
			for(int j=0;j<2;j++)
			{
				
			if(a[j][i]<min)
				min=a[j][i];
			
			}
			System.out.println(min);
		}

	}

}
