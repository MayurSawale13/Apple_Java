package test;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Movie;
import pojo.Theatre;

public class TheatreMain {
	

	public static void main(String[] args) {
		ArrayList<Theatre> t=new ArrayList<>();
		ArrayList<Movie> m1=new ArrayList<>();
		m1.add(new Movie(12,4,"Kanatara"));
		m1.add(new Movie(55,3,"RRR"));
		m1.add(new Movie(14,1,"kjo"));
		m1.add(new Movie(16,4,"DDLJ"));
		m1.add(new Movie(14,4,"K3G"));
		ArrayList<Movie> m2=new ArrayList<>();
		m2.add(new Movie(14,3,"IM3"));
		m2.add(new Movie(03,1,"Happy"));
		m2.add(new Movie(25,6,"KGF"));
		m2.add(new Movie(86,4,"bahubali"));
		m2.add(new Movie(63,2,"no entry"));
		ArrayList<Movie> m3=new ArrayList<>();
		m3.add(new Movie(12,1,"Hera Pheri"));
		m3.add(new Movie(55,3,"FightClub"));
		m3.add(new Movie(14,1,"blidspot"));
		m3.add(new Movie(16,2,"no 7"));
		m3.add(new Movie(14,5,"Ocean 11"));
		
		Theatre d1=new Theatre(260,"Inox",m1);
		Theatre d2=new Theatre(54,"PVR",m2);
		Theatre d3=new Theatre(2,"MGM",m3);
		t.add(d1);
		t.add(d2);
		t.add(d3);
		
		System.out.println(d1);
		Iterator<Theatre>s=t.iterator();
		while(s.hasNext())
		{
			Theatre w=s.next(); 
		Iterator<Movie> y1=w.m.iterator();
		while(y1.hasNext())
		{
			
			if(y1.next().noofshows<=2)
			{
				y1.remove();
			}
		}
		}
		System.out.println(t);
	}

}
