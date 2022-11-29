package polymorphism;

public class Comapare {
	
	void compare(int a, int b)
	{
		if(a>b)
			System.out.println("Max:"+a);
		else
			System.out.println("Max:"+b);
	}
	void comapre(char a,char b)
	{
		if((int)a>(int)b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	public static void main(String[] args) {
		Comapare c=new Comapare();
		c.compare(5, 2);
		c.comapre('s', 'v');
	}
}
