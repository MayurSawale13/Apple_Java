package string;

public class CountOfNumbers {

	public static void main(String[] args) {
		String c="heLlo123@#*";
		int countAlpha=0,countNum=0, countSpe=0;
		for(int i=0;i<c.length();i++)
		{
			if(c.charAt(i)>=('a') && c.charAt(i)<=('z')
				||	c.charAt(i)>=('A') && c.charAt(i)<=('Z'))
				countAlpha++;
			else if(c.charAt(i)>=('0') && c.charAt(i)<=('9'))
				countNum++;		
			else 
				countSpe++;
		}
		System.out.println("count of number:"+countNum);
		System.out.println("count of Aplhabhets: "+countAlpha);
		System.out.println("count of Special Charcters: "+countSpe );
	}

	}


