package Encapsulation;

public class Flight {
	
	private int id;
	private String source,dest,clas,company;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setSource(String source)
	{
		this.source=source;
	}
	public void setDest(String dest)
	{
		this.dest=dest;
	}
	public void setClas(String clas)
	{
		this.clas=clas;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public int getId(){
		return id;
	}
	public String getSource(){
		return source;
	}
	public String getDest(){
		return dest;
	}
	public String getClas(){
		return clas;
	}
	public String getCompany(){
		return company;
	}
	Flight(int id)
	{
		
	}
	Flight()
	{
		
	}
	void ticketRate()
	{
		int fare1;
		if(clas.equalsIgnoreCase("business"))
			fare1=10000;
		else if(clas.equalsIgnoreCase("economy"))
			fare1=7000;
		else
			fare1=5000;
		System.out.println("flight fare: " +fare1);
	}
	void display()
	{
		System.out.println("flight Id: "+getId());
		System.out.println("flight source: "+getSource());
		System.out.println("flight Destination: "+getDest());
		System.out.println("flight Class: "+getClas());
		System.out.println("flight Class: "+getCompany());
	}
	

}
