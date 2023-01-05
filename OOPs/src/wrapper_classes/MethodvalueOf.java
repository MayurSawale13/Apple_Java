package wrapper_classes;

public class MethodvalueOf {

	public static void main(String[] args) {
		Integer i=Integer.valueOf("123500");//numerical string
		System.out.println(i);

		
		Integer i2=Integer.valueOf("0101",2);//2*0+1  2^1+0  2^2+1 2^3+0
		System.out.println(i2);
		Integer i3=Integer.valueOf("0123",4);//4^0+3 4^1+2 4^2+1 4^3+0
		System.out.println(i3);
	}

}
