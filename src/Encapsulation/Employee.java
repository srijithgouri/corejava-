package Encapsulation;

public class Employee {
private int empId;  // Data hiding
private String name;
private long phone;
private String email;

public int getEmpId(){
	return empId;
}
public void setEmpId(int empId){
	this.empId=empId;
}
public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public long getPhone(){
	return phone;
}
public void setPhone(long phone){
	this.phone=phone;
}
public String getEmail(){
	return email;
}
public void setEmail(String email){
	this.email=email;
}
}
