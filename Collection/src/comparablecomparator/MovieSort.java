package comparablecomparator;

import java.util.Comparator;

public class MovieSort implements Comparator<Movie> {

	public int compare(Movie m1,Movie m2)
	{
		return m1.name.compareTo(m2.name);
	}
}
