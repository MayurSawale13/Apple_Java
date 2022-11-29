
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='A';		//ASCIIE value of 'A'=65 and 'a'=97
		int i=ch;			//to add 32 to ch convert to int
		
		i=i+32;
		System.out.println((char)i);	//TypeCasting to get 'a' ie convert char value
		
		i=i-32;
		System.out.println((char)i);	//typeCasting to get 'A'
		
		ch=(char)(ch+32);		//direct conversion
		System.out.println(ch);

	}

}
