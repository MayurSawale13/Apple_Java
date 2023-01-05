package exception_assignment;

public class ReturnValue {

	@SuppressWarnings("finally")
	int postive(){
		try{
		
		//	System.out.println(a);
			return 10/0;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();;
		}
		finally{
			return -9;
		}
	}
	public static void main(String[] args) {
		ReturnValue r=new ReturnValue();
		int b=r.postive();
		System.out.println(b);
	}

}
