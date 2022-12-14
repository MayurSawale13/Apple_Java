package arrays;

import java.util.Scanner;

public class MainTheatreMovie {

	public static void main(String[] args) {
		Theatre t[]=new Theatre[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<t.length;i++){
			Movie m1[]=new Movie[2];
			System.out.println("Enter tid,tname,and movie details:");
			int tid=sc.nextInt();
			String name=sc.next();
			for(int j=0;j<m1.length;j++)
			{
				System.out.println("Enter mid,releaseYear,mobie name");
				int mid=sc.nextInt();
				int roy=sc.nextInt();
				String mname=sc.next();
				m1[j]=new Movie(mid,roy,mname);
			}
			t[i]=new Theatre(tid,name,m1);
		}
		for(Theatre r:t)
		{
			System.out.println(r);
		}

	}

}
