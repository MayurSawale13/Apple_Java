package polymorphism_assignment;

 class Kid {

	public void readBook(int n) {
		
		System.out.println("Kid Reading Method"+n);
	
	}
	void readBook()
	{
		System.out.println("reading book kid ");
	}
}
class Bigkid extends Kid{
	
}