package comparablecomparator;

public class Car implements Comparable<Car>{
	int id,price;
	String name,brand;
	Car(int id,int price,String name,String brand)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.brand=brand;
	}
	public String toString()
	{
		return id+" "+price+" "+name+" "+brand;
	}
	public int compareTo(Car c1)
	{
		if(this.brand.compareTo(c1.brand)==0)
		{
			
			if(this.price>c1.price)
				return 1;
			else if(this.price<c1.price)
				return -1;
			else
				return this.name.compareTo(c1.name);
		}
		else
			return this.brand.compareTo(c1.brand);
	}
	}


