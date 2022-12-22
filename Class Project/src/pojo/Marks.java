package pojo;

public class Marks {
	private int physics,chemistry,math;

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public String toString()
	{
		return "Phy: "+physics+" Chem: "+chemistry+" Math: "+math;
	}

}
