package strings_assignments;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String s="the java is core of java and core of programming ";
		String s1[]=s.split(" ");
		int count=0;
		int flag=1;
		for(int i=0;i<s1.length;i++)
		{ 
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j])){
					System.out.print(s1[i]+" ");
					count++;
					
				}
				
			}
			
			}
		System.out.println("\nCount of Duplicate words: "+count);
}

}
