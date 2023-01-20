package map_assignment;

import java.util.Comparator;

public class OrderSort implements Comparator<Order> {
  public int compare(Order o1,Order o2){
	  return o1.city.compareTo(o2.city);
  }
}
