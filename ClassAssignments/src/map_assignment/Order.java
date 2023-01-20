package map_assignment;

/*Flipkart maintains a list<order> from different
places .Order has (orderid,city,itemname,status).
From this create a Map which stores key has 
cityname and count as no of order’s delivered in 
that city. Data should be sorted according to city*/
public class Order {

	int orderId;
	String city, itemname, status;

	Order(int id, String city, String itemname, String status) {
		this.orderId = id;
		this.city = city;
		this.itemname = itemname;
		this.status = status;
	}

	public String toString() {
		return orderId + " " + city + " " + itemname + " " + status;
	}

	public int compareTo(Order o) {
		return this.city.compareTo(o.city);
	}
}
