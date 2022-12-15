package arrays_object;

import java.util.Scanner;

public class MainPersonIdproof {

	public static void main(String[] args) {
		Person p[]=new Person[1];
		Person p1=new Person();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter id,name,address of person:");
			int pid=sc.nextInt();
			String name=sc.next();
			String add=sc.next();
			
			Idproof idp[]=new Idproof[2];
			for(int j=0;j<idp.length;j++)
			{
				Idproof f=new Idproof();
				System.out.println("Enter id,name, validity for idproof");
				int id1=sc.nextInt();
				String name1=sc.next();
				String validity=sc.next();
				f.setId(id1);
				f.setName(name1);
				f.setValidity(validity);
				idp[j]=f;
			}
			p1.setPid(pid);
			p1.setPname(name);
			p1.setAddress(add);
			p1.setId(idp);
			p[i]=p1;
		}
		for(Person o:p)
		{
			for(Idproof d:o.id)
			{
				if(d.getName().equalsIgnoreCase("pan"))
				{
					System.out.println(d.getName()+d.getValidity());
				}
			}
		System.out.println(o);
		}

	}

}
