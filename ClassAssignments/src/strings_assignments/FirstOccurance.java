package strings_assignments;

public class FirstOccurance {

	public static void main(String[] args) {
	String s="occurrence";
	char []c=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='c'){
			System.out.println("First Occurence is @ "+i+" index of : "+c[i]);
			break;
			}
	}

	}

}
