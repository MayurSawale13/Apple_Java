package strings;

public class Array {

	public static void main(String[] args) {
		
	//1.hard code
		int a[]={1,2,3,4};
		String s[]={"name","javac","advance"};
		// 				0	 1		2
		for(int i=0;i<s.length;i++)
		{
			char ch[]=s[i].toCharArray();
			//System.out.println(ch[i]);
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='a' || ch[j]=='e')
				{
					System.out.println(ch[j]+" "+j);
				}
			}
		}
	//2.ref hard code
		int a1[]=new int[2];
	//	<data type><ref name>=new <data type><size>
	// 	Student s1[]=new Student[3]
		a1[0]=2;
		a1[1]=3;
	//3 for loop: int
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a'||a[i])
				a[i]=1;
		}*/
		//if
	/*	crud
		create -add element
		read  -dispaly/find
		update -replace
		delete -delete*/
		
		/*
		String s="Atif";  //a t i f
		char ch[]=s.toCharArray();
			//a=<string name>.<toCharArray>	
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch[i]=='a' || ch[i]=='i')
			{
				System.out.println(ch[i]);
			}
		}
		
		Student s[]=new Student[2];
		//Student s1= id name;
		
		s[0]=12 mayur 
		s[1]=2, atif 		

	}*/
	}

}
