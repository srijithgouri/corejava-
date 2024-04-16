package Bankproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bank  {
	List<Customer> customer1=new ArrayList<Customer>();
	
	
	public String add_Personal_Customer(String fname,String lname,String address,double balance,int personal_ph,int work_ph){
		Personal_customer cust1=new Personal_customer(fname,lname,address,balance,personal_ph,work_ph);
		customer1.add(cust1);
		return "personal account created successfully,your id is:"+cust1.getId();
	
		}
	public String add_Business_Customer(String fname,String lname,String address,double balance,int business_ph,int personal_ph,String business_name){
		Business_customer cust1=new Business_customer(fname,lname,address,balance,personal_ph,business_ph,business_name);
		customer1.add(cust1);
		return " business account created successfully,your id is:"+cust1.getId();
		}
	public void displayCustomer(){
		for(Customer customer:customer1){
			customer.show();
	}	
	}
	public String deposit(int id,double amount){
		for(Customer customer2:customer1){
		if(id==customer2.id){
			customer2.setBalance(customer2.getBalance()+amount);
			return " amount deposited successfully,current balance is:"+ customer2.getBalance();
			
		}
	}
		return "user id not found";
}
	public String withdraw(int id,double amount) throws Insufficient_exception{
		for(Customer customer2:customer1){
			if(id==customer2.getId()){
				if(customer2.getBalance()> amount){
					customer2.setBalance(customer2.getBalance() - amount);
					return "withdraw successfull, remaining amount is:" + customer2.getBalance();
				}
				else{
					throw new Insufficient_exception();
				}
			}
		}
		return "user not found";
	}
	public String transfer(int fid,int tid,double amount) throws Insufficient_exception{
		for(Customer customer2:customer1){
			if(fid==customer2.getId()){
				for(Customer customer3:customer1){
					if(tid==customer3.getId()){
						if(customer2.getBalance()> amount){
					customer2.setBalance(customer2.getBalance() - amount);
					customer3.setBalance(customer3.getBalance() + amount);
					return "amount transfered successfully,remaining balance is"+customer2.getBalance();
					}
						else{
							throw new Insufficient_exception();
						}
						}
					}
				return " receiver id not found";
				}
			}
		return " senders  id not found";
}
}
