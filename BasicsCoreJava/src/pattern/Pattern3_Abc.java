package pattern;

public class Pattern3_Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char rows='a';
		for(char i='a';i<='d';i++){
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---downward----");
		for(char i='d';i>='a';i--){
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}


	}

}
