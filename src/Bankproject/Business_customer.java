package Bankproject;

public class Business_customer extends Customer{
	protected int business_ph;
	protected int personal_ph;
	protected String business_name;
	
	public Business_customer() {
		super();
		
	}
	public Business_customer(String fname, String lname, String address, double balance,int business_ph,int personal_ph,String business_name) {
		super(fname, lname, address, balance);
		this.business_ph=business_ph;
		this.personal_ph=personal_ph;
		this.business_name=business_name;
	}
	public int getBusiness_ph() {
		return business_ph;
	}
	public void setBusiness_ph(int business_ph) {
		this.business_ph = business_ph;
	}
	public int getPersonal_ph() {
		return personal_ph;
	}
	public void setPersonal_ph(int personal_ph) {
		this.personal_ph = personal_ph;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public   double interest(){
	return (balance* 3.0)/100;
	
	}
}