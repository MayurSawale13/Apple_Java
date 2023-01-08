package collection;

import java.util.ArrayList;

public class First50OddNumArrayList {

	void oddNum(){
		ArrayList <Integer> odd=new ArrayList<>();
		int count=0;
		for(int i=0;i<=110;i++)
		{
			if(i%2!=0)
			{
				odd.add(i);
				count++;
			}
			if(count==50)
			{
				break;
			}
		}
		System.out.println(odd);
	}
	
	public static void main(String[] args) {
		First50OddNumArrayList c=new First50OddNumArrayList();
		c.oddNum();

	}

}
