package august_eclipse_test;

public class Order implements Comparable<Order> {
	int orderid;
	String item,city,status;
	Order(int id,String item,String city,String status){
		this.orderid=id;
		this.item=item;
		this.city=city;
		this.status=status;
	}
	public String toString(){
		return orderid+" "+item+" "+city+" "+status;
	}
	public int compareTo(Order o1){
		return this.city.compareTo(o1.city);
	}

}
