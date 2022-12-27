package wrapper_classes;

public class WrapperClassEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;//boxing/wrpping
		Integer it=new Integer(i);//till 1.4jdk
		Integer it1=i;//AutoBoxing
		//wrapper classes are immutable ie final class
		
		Integer it2=new Integer(i);
		System.out.println(it1==it2);//memry loc
		System.out.println(it1.equals(it2));//content

		Integer a=new Integer(2000);
		int a1=a.intValue();//auto-unboxing obj->primitive data type
		System.out.println(a1);
		
		int b=1000;
		a=1000;//auto boxing primitive data type ->obj
	}

}
