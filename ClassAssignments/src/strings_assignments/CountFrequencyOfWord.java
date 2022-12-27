package strings_assignments;

public class CountFrequencyOfWord {

	public static void main(String[] args) {
	String s="The Hill of Haunting of Hill House";
	String s1[]=s.split(" ");
	int freq[]=new int[s1.length];
	for(int i=0;i<s1.length;i++)
	{
		freq[i]=1;
		for(int j=i+1;j<s1.length;j++)
		{
			if(s1[i].equals(s1[j])){
				freq[i]=freq[i]+1;
			   s1[j]="0";
			}
		}
	}
	for(int i=0;i<freq.length;i++)
	{
		if(!s1[i].equals("0")){
			System.out.print(s1[i]+" - "+freq[i]+" ");
		}
	}
	

	}

}
