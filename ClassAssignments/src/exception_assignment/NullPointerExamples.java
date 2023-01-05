package exception_assignment;

import java.util.Arrays;

public class NullPointerExamples {
	void arrayNull(){
		String a[]=new String [2];
		a[0]="1";
		a[1]=null;
		String s=null;
	//	String c="abls"+null;
		try{
			//System.out.println(c);
			
			for(int i=0;i<a.length;i++){
				if(s.charAt(i)=='a'){
					System.out.println(s);
				}
				/*if(a[i].equals("a")){
					System.out.println(a[i]);	
			}*/
				
				
			}
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		NullPointerExamples n=new NullPointerExamples();
		NullPointerExamples e=null;
		//e.toString();
		n.arrayNull();
		
	}

}
