package extra_prep;

/*Program on arraylist
Plane ( id,name,no of seats)
Company (Cid,cname,listofplane)
Find the company and plane ...lowest and highest seats of plane*/
public class Plane {
		int id, no_of_seat;
		String name;
		public Plane(int id,String name,int no){
			this.id=id;
			this.name=name;
			this.no_of_seat=no;
		}
		public String toString(){
			return id+" "+name+" "+no_of_seat;
		}
}
