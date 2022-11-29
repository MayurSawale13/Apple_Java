 
class B1{
	 private String username,password;
	 public String getUserName(){
		 return username;
	 }
	 public void setUserName(String s)
	 {
		 username=s;
	 }
	 public String getPassword()
	 {
		 return password;
	 }
	 public void setPassword(String p)
	 {
		 password=p;
	 }
	
}
public class GetterSetter {

	public static void main(String[] args) {
		B1 user=new B1();
		System.out.println("user name: "+user.getUserName());
		user.setUserName("mohd tariq");
		user.setPassword("allah@heaven");
		System.out.println("user name: "+user.getUserName());
		System.out.println("password : "+user.getPassword());
	}

}
