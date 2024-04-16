package Bankproject;

public class Personal_customer extends Customer {
	protected int work_ph;
	protected int personal_ph;
	public Personal_customer() {
		super();
	}
	public Personal_customer(String fname, String lname, String address, double balance,int work_ph,int personal_ph) {
		super(fname, lname, address, balance);
		this.work_ph=work_ph;
		this.personal_ph=personal_ph;	
	}
	public int getWork_ph() {
		return work_ph;
	}
	public void setWork_ph(int work_ph) {
		this.work_ph = work_ph;
	}
	public int getPersonal_ph() {
		return personal_ph;
	}
	public void setPersonal_ph(int personal_ph) {
		this.personal_ph = personal_ph;
	}
	public double interest(){
		return (balance*4.0)/100;
	}
	
}