package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class MovieOp {
	

		
		void setData(ArrayList<Movie> movie1) {
			
			ArrayList<Actor> k=new ArrayList<Actor>();
			k.add(new Actor(102,"Rishabh Shetty"));
			k.add(new Actor(54,"Sapthami Gowda"));
			k.add(new Actor(84,"Kishor"));

			ArrayList<Actor> b=new ArrayList<Actor>();
			b.add(new Actor(12,"Ranveer Kapoor"));
			b.add(new Actor(51,"Alia Bhatt "));
			b.add(new Actor(54,"Amitabh Bacchan"));
			
			ArrayList<Actor> v=new ArrayList<Actor>();
			v.add(new Actor(20,"Ajay Devgon"));
			v.add(new Actor(54,"Rakul preet"));
			v.add(new Actor(54,"Amitabh Bacchan"));
			
			
			ArrayList<Actor> sholey=new ArrayList<Actor>();
			sholey.add(new Actor(33,"Dharmendra"));
			sholey.add(new Actor(54,"Amitabh Bacchan"));
			sholey.add(new Actor(73,"Hema Malini"));
			
			movie1.add(new Movie(222,"Kantara",k));
			movie1.add(new Movie(514,"Runway 34",b));
			movie1.add(new Movie(125,"Ved",v));
			movie1.add(new Movie(86,"Sholey",sholey));

		
		}
		public static void main(String[] args) {
			
			ArrayList<Movie> movie = new ArrayList<Movie>();
			
			MovieOp mo = new MovieOp();
			
			mo.setData(movie);
			
			System.out.println(movie);
			
			Collections.sort( movie,new MovieSort());
			
			System.out.println(movie);
			
			
			
		}
	}

