package array;

public class Series {
//0,1,2,5,12,29
	
//0*0+1,1*1+1,2*2+1,5*2+2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1;
		int n2=0;
		int n3=0;
		for(int i=0;i<10;i++){
			System.out.print(n3+" ");
			n3=(n2*2)+n1;
			
			n1=n2;
			n2=n3;
			//n3=n1
			//k=h;
			
		}
	}

}
