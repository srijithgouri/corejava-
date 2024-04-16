package Bankproject;

abstract public class Customer {
	
private static int count=1000;
 protected int id;
 protected String fname;
 protected String lname;
 protected String address;
 protected double balance;
public Customer() {
//	this.id=++count;
}
public Customer(String fname, String lname, String address, double balance) {
	this.id=++count;
	this.fname = fname;
	this.lname = lname;
	this.address = address;
	this.balance = balance;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getId() {
	return id;
}
abstract public double interest();
public  void show(){
	System.out.println("the id is "+ id );
	System.out.println("the full name is "+ fname+lname );
	System.out.println("the address is "+ address );
	System.out.println("the balance  is "+ balance );
	System.out.println("the interest is "+ interest() );
}

 
}