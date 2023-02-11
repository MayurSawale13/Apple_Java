package test9;

public class MinNumberWithoutSort {

	public static void main(String[] args) {
		
		int a[]={10,20,10,10,20,30,40,50};
		int min =a[0];
		int m=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min){
				min=a[i];
				m=i;
			}
		}
			int min2 = a[m+3];
		
		for(int i1=0;i1<a.length;i1++)
		{
			
			if(a[i1]<min2 && a[i1]!=min)
				min2=a[i1];
		}
		//System.out.println(min2);
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				
					
						
					
					if(a[j]<a[i] && a[j]!=a[j+1])
						c++;
					
					
			}
			
			if(c==1){
				System.out.println("2nd min:"+a[i]+" "+c);
				break;
			}
			
			
		}
		

	}

}
