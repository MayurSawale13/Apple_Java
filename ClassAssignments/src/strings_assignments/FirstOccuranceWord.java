package strings_assignments;

public class FirstOccuranceWord {

	public static void main(String[] args) {
		String s="java is core is core language java";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j])){
					System.out.print(s1[j]+" @"+(i+1));
					count++;
				}
				
			}
		}
		
		
		

	}

}
