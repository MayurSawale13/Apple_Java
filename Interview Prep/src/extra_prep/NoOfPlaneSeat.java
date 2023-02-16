package extra_prep;

import java.util.ArrayList;

public class NoOfPlaneSeat {
	void createList(ArrayList<Company> al){
		ArrayList<Plane>al1=new ArrayList<>();
		ArrayList<Plane>al2=new ArrayList<>();
		al1.add(new Plane(20,"MumToGoa",56));
		al1.add(new Plane(21,"PuneToGoa",86));
		al2.add(new Plane(25,"GoaToHyd",36));
		al2.add(new Plane(15,"DelhiToGoa",76));
		al.add(new Company(101,"air india",al1));
		al.add(new Company(102,"akasa air",al2));
		
	}
	void searchMinSeat(ArrayList<Company> al){
		
		int min=al.get(0).p.get(0).no_of_seat;
		String cname="";
		for(Company x:al){
			for(Plane p :x.p){
				if(p.no_of_seat<min){
					min=p.no_of_seat;
					cname=x.name;
				}
			}
			
		}
		
		System.out.println("Company with Min seats number :"+cname+"-"+min);
	}
void searchMaxSeat(ArrayList<Company> al){
		
		int max=al.get(0).p.get(0).no_of_seat;
		String cname="";  
		for(Company x:al){
			for(Plane p :x.p){
				if(p.no_of_seat>max){
					max=p.no_of_seat;
					cname=x.name;
				}
			}
			
		}
		System.out.println("Company with max seats number :"+cname+"-"+max);
	}

	public static void main(String[] args) {
		NoOfPlaneSeat cp=new NoOfPlaneSeat();
		ArrayList<Company> al=new ArrayList<>();
		cp.createList(al);
		cp.searchMinSeat(al);
		cp.searchMaxSeat(al);

	}

}
