package strings_assignments;

public class Pangram {

	public static void main(String[] args) {
		String s="the quick brown fox jumps over lazy dog";
		int n=s.length();
		boolean visited[]=new boolean[26];
		for(int i=0;i<n;i++)
		{
			char x=s.charAt(i);
			if(x>='a' && x<='z')
				visited[x-'a']=true;
			if(x>='A' && x<='Z')
				visited[x-'A']=true;
		}
		int flag=0;
		for(int i=0;i<26;i++)
		{
			if(visited[i]==false){
				flag=1;
				break;
				}
			else
				System.out.print(visited[i]+" "+i);
		}
		if(flag==0)
			System.out.println("it's a panagram");
		else
			System.out.println("it's a not  panagram");
	}
	
	


}
