package day5;

public class College extends University{
	int cid;
	String cname;
	public College()
	{
		
		System.out.println("default Constructor");
	}
	public void detalis()
	{
		cid=124;
		cname="sait";
	}
	public College(int a,String s)
	{
		
		System.out.println("para");
		cid=a;
		cname=s;
	}
	public void display()
	{
		System.out.println("college Id: "+cid+"\nCollage Name: "+cname);
	}

}
