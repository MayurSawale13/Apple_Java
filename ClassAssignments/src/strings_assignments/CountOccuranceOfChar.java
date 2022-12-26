package strings_assignments;

public class CountOccuranceOfChar {

	public static void main(String[] args) {
		String s="occurrence";
		char []c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='c'){
					count++;
				}
		}
		System.out.println("Total Occurance of c :"+count);
	}

}
