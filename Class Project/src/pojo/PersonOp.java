package pojo;

import java.util.ArrayList;
import java.util.Iterator;

import dao.Address;
import dao.Person;

public class PersonOp {
	void addElement(ArrayList<Person> a)
	{
		Person p1=new Person(152,78659845,"Akhil",(new Address("pune","MH")));
		Person p2=new Person(121,76598845,"Bala",(new Address("mysore","KA")));
		Person p3=new Person(11,86596598,"Nazir",(new Address("mumbai","MH")));
		Person p4=new Person(160,9658984,"Shiva",(new Address("pune","MH")));
		Person p5=new Person(153,65987545,"david",(new Address("mumbai","MH")));
		Person p6=new Person(181,549845,"jack",(new Address("pune","MH")));
		Person p7=new Person(10,78655445,"Gauri",(new Address("mysore","KA")));
	 a.add(p1);a.add(p2);a.add(p3);a.add(p4);a.add(p5);a.add(p6);a.add(p7);
	}
	
	void display(ArrayList<Person> a){
		for(Person x:a)
		{
			if(x.a.city.equalsIgnoreCase("pune"))
			{
				System.out.println(x.name+" "+x.contact+" "+x.a.city);
			}
		}
	}
	void removeEle(ArrayList<Person> a){
		Iterator<Person> it=a.iterator();
		while(it.hasNext())
		{
			if(it.next().a.city.equals("mumbai"))
			{
				it.remove();
			}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Person> al=new ArrayList<>();
		PersonOp p=new PersonOp();
		p.addElement(al);
		p.display(al);
		System.out.println(al);
		p.removeEle(al);
		System.out.println(al);
	}
	

}
