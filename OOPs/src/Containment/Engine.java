package Containment;

public class Engine {
	private int cylinder,torque;
	private String rpm,comp;
	Engine(int c,int t,String rpm,String comp)
	{
		cylinder=c;
		torque=t;
		this.rpm=rpm;
		this.comp=comp;
	}
/*	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}
	public String getRpm() {
		return rpm;
	}
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}*/
	public String toString()
	{
		return "\nno: "+cylinder+" rpm: " +rpm +" Company: " +comp+" T: "+torque;
	}
}
