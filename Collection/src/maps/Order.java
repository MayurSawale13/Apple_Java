package maps;

public class Order {

	int id,cost;
	
	OrderStatus s;
	Order(int id,int cost,OrderStatus s)
	{
		this.id=id;
		this.cost=cost;
		this.s=s;
	}
	public String toString()
	{
		return id+" "+cost+" "+s;
	}
}
