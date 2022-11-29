package Containment;

public class Driver {
int did;
String dname,contact;

Driver(int d,String dname,String c)

{
this.did=d;
this.dname=dname;
this.contact=c;
}
public String toString()
{
	return "\nDriver id: "+did+" Driver name:"+dname+" Contact:"+contact;
}

}
