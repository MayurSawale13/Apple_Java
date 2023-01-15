package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class MovieActorMain {
	void addMovie(ArrayList<Movie> m1)
	{
		ArrayList<Actor>a1=new ArrayList<>();
		a1.add(new Actor(2,"Amitabh" ));
		a1.add(new Actor(1,"Ranbir" ));
		a1.add(new Actor(3,"Alia" ));
		m1.add(new Movie(5,"Bramhastra",a1));
		
		ArrayList<Actor>a2=new ArrayList<>();
		a2.add(new Actor(2,"Amitabh" ));
		a2.add(new Actor(1,"Srk" ));
		a2.add(new Actor(3,"Hritik" ));
		a2.add(new Actor(4,"Kajol" ));
		a2.add(new Actor(5,"Kareena" ));
		m1.add(new Movie(7,"K3G",a2));
		
		ArrayList<Actor>a3=new ArrayList<>();
		a3.add(new Actor(1,"Yash" ));
		a3.add(new Actor(2,"Sanjay" ));
		a3.add(new Actor(4,"Ravvena" ));
		a3.add(new Actor(3,"Srineedhi" ));
		m1.add(new Movie(2,"KGF",a3));
	}
	
	public static void main(String[] args) {
		ArrayList<Movie> m=new ArrayList<>();
		MovieActorMain d=new MovieActorMain();
		d.addMovie(m);
		System.out.println(m);
		System.out.println("Movie and Actor sorting with name:");
		Collections.sort(m,new MovieSort());
		for(Movie s:m)
		{
			Collections.sort(s.a1,new ActorSort());
			System.out.println(s);
		}
	}
}
