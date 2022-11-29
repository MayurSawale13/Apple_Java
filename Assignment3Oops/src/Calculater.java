
public class Calculater {

	int a,b,c;
	void add(int as,int ba){
		System.out.println(as+ba);
				}
	public int sub(int d,int f){
		System.out.println((d-f));
		return d;
	}
	public void multi(int d,int f ){
		a=d;
		b=f;
		System.out.println((a*b));
	}
	
	
	public static void main(String[] args) {
		
		Calculater c=new Calculater();
		c.add(5, 6);
		c.sub(10, 2);
		c.multi(5, 8);
	}
	
	
}
