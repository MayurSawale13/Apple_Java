
public class WhileNumExm {

	public static void main(String[] args) {
		/*//First 10 natural numbers 
		int num=0;		//Intialization
		while(num <=10)		//check Condition
		{
			System.out.print(num);
			num++;				//Re-Intialiaze;
		}
		System.out.println("out loop after condition false"); // 
*/	
		
	//table of any number
		int num=2; 
		int i=1;
		while (i<=10)
		{
					// Is used skip specific itearation
			//Is used to take control out of LOOP
			int table=num*i;
/*			if(i==10)
				break;	
		if (i==5)
				continue;*/
			System.out.println(+num+ "* " +i+ "="+table);
			i++;
		}
		
			
	
	}

}
