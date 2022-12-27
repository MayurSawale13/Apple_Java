package exceptions;

public class StringThrowEx {
	
public int getStringLength (String s) throws NullPointerException
{
	/*if(s==null)
	{
		throw new NullPointerException("String cannot be null");
	}*/
	int l=s.length();
	return l;
}
void stringOp(String s){
	try{
	//System.out.println(getStringLength(s));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	}
	catch(NullPointerException e ){
		e.printStackTrace();
	}
	}

public static void main(String[] args) {
	String s=null;
	
	StringThrowEx s1=new StringThrowEx();
	s1.stringOp(s);
	//System.out.println(s1.getStringLength(s));
}
}
