package inheritance;

public class MyTime extends MyDate1 {
	private int hh,mm,ss;

	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {
		this.hh = hh;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = ss;
	}
	public static void main(String[] args) {
		MyDate1 t1=new MyDate1();
		t1.setDd(13);
		t1.setMm1(01);
		t1.setYyyy(1992);
		
		MyTime d=new MyTime();
		d.setHh(07);
		d.setMm(30);
		d.setSs(00);
		System.out.println("Date:"+d.getDd()+"/"+t1.getMm1()+"/"+t1.getYyyy());
		System.out.println("Time:"+d.getHh()+":"+d.getMm()+":"+d.getSs());
	}

}
