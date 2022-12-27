package wrapper_classes;

public class ConstructorsOfWraaper {

	public static void main(String[] args) {
		
		Integer i=new Integer(456);
		//Integer i1=new Integer("abc");
		System.out.println(i);
		//System.out.println(i1);
		
		Float f1=new Float(4.5);//float
		Float f2=new Float(4.5);//Double
		Float f3=new Float("4.5");//String
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		Character c=new Character('a');//only char
		System.out.println(c);
	}

}
