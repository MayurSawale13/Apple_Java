package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Character>gt=new ArrayList<>();
		
		gt.add('d');
		gt.add('g');
		gt.add('h');
		gt.add('d');
		gt.add('d');
		gt.add('h');
		gt.add('g');
		
		System.out.println(gt);
		for(int i=0;i<gt.size();i++)
		{
			for(int j=i+1;j<gt.size();j++)
			{
				if(gt.get(i)==gt.get(j))
				{
					gt.remove(i);
				}
			}
		}
		System.out.println(gt);
		//for(<var>;<condn>;increnent)
		/*Iterator<Character> it;
		Iterator<Character> it1;
		for(it=gt.iterator();it.hasNext();)
		{
			for(it1=)
		}*/

	}

}
