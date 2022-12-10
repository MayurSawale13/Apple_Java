package video_assignments.day3;


public class MovieClass {
	
	int YearOfRelease;
	float profit;
	String producerName,actorName;

	//Retutn-type MethodName (<Parameters>)
	void acceptDetails(int y,float p,String pr,String a){
		
		YearOfRelease=y;
		profit=p;
		producerName=pr;
		actorName=a;
		
	}
	void showDetails()
	{
		System.out.println("Moive profit: "+profit);
		System.out.println("ActorNmae: "+actorName);
		System.out.println("Year Of Realease: "+YearOfRelease );
		System.out.println("Produce : "+producerName);
	}
	public static void main(String[] args) {
		
		MovieClass bookSmart=new MovieClass();
		bookSmart.acceptDetails(2019, 2512458f, "adam", "ted");
		bookSmart.showDetails();
	}
}
