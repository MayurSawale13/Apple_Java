package test4;
/*Create an array of 5 Boolean values . Hardcode array is fine. Count how many of them are
‘true’ . [1m]*/
public class Q8 {

	public static void main(String[] args) {
	boolean b[]={true,true,false,true,false};
	int c=0;
	for(int i=0;i<b.length;i++){
		if(b[i]==true)
			c++;
	}
	System.out.println("number of true :"+c);

	}

}
