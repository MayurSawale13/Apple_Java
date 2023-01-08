package list;

import java.util.ArrayList;

public class MethodsOfList {

	public static void main(String[] args) {

ArrayList<Integer> al=new ArrayList<>();

	al.add(11);
	al.add(118);
	al.add(151);
	al.add(141);
	al.add(118);al.add(111);
	
	//add method@ index
	al.add(2,555);
	System.out.println(al);
	//remove @ index
	al.remove(1);
	System.out.println(al);
	//element present in list
	System.out.println(al.contains(555));
	//list is empty or not
	System.out.println(al.isEmpty());
	//First Occurance Index of element:
	System.out.println(al.indexOf(111));
	//Last Occurance Index of element
	System.out.println(al.lastIndexOf(555));
	//Size of ArrayList
	System.out.println(al.size());
	//clear will delete all elemnts
     //(al.clear());	
	//adding one arrayList to other
	ArrayList<Integer> alnew=new ArrayList<>();
	alnew.add(118);
	alnew.add(555);
	alnew.add(200);
	al.addAll(alnew);
	//add another list at index
	al.addAll(2, alnew);
	System.out.println(al);
	//remove one list from other
	/*al.removeAll(alnew);
	System.out.println(al);*/
	//reatain all element of one list 
	al.retainAll(alnew);
	System.out.println(al);
	//replace elemnt @index
	al.set(0, 11);
	System.out.println(al);
	//check two list are equal
	System.out.println(al.equals(alnew));
	}

}
