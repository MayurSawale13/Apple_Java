package maps;

public class OrderStatus {
	String deliveryDate,status;
	OrderStatus(String deliveryDate,String status)
	{
		this.deliveryDate=deliveryDate;
		this.status=status;
	}

	public String toString()
	{
		return deliveryDate+" "+status;
	}
}
