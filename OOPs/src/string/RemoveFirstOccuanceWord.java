package string;

import java.util.Arrays;

public class RemoveFirstOccuanceWord {

	public static void main(String[] args)
	{
		String s="The Hill of Haunting of Hill House";
		String s1[]=s.split(" ");
		String word="Hill";
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].equals(word))
			{
				s1[i]="";
				break;
			}
		}
			System.out.println(Arrays.toString(s1));
	}

}
