package Bankproject;

import java.util.Collections;
import java.util.Scanner;

public class Customer_tester {

	public static void main(String[] args) {
		
		Customer p=new Personal_customer();
		Customer b=new Business_customer();
		Bank bank =new Bank();
		Scanner sc=new Scanner(System.in);
		int choice;
		int type;
		String result;
		do{
			System.out.println("1.add new customer");
			System.out.println("2.show all customers");
			System.out.println("3.depoist");
			System.out.println("4.withdraw");
			System.out.println("5.Transaction");
			System.out.println("enter choice");
			choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("enter account type");
			System.out.println("1.personal account");
			System.out.println("2.business account");
			type=sc.nextInt();
			switch(type){
			case 1:
			System.out.println("enter first name");
			String fname=sc.next();
			System.out.println("enter last name");
			String lname=sc.next();
			System.out.println("enter address");
			String address=sc.next();
			System.out.println("enter amount");
			double balance=sc.nextDouble();
			System.out.println("enter personal phone number");
			int personal_ph=sc.nextInt();
			System.out.println("enter work phone number");
			int work_phone=sc.nextInt();
			result=bank.add_Personal_Customer(fname, lname, address, balance,personal_ph,work_phone);
			System.out.println(result);
			break;
		case 2:
			System.out.println("enter business name");
			String business_name=sc.next();
			System.out.println("enter first name");
			String fname1=sc.next();
			System.out.println("enter last name");
			String lname1=sc.next();
			System.out.println("enter address");
			String address1=sc.next();
			System.out.println("enter amount");
			double balance1=sc.nextDouble();
			System.out.println("enter personal phone number");
			int personal_ph1=sc.nextInt();
			System.out.println("enter business phone number");
			int business_ph1=sc.nextInt();
			result=bank.add_Business_Customer(fname1, lname1, address1, balance1,personal_ph1,business_ph1,business_name);
			System.out.println(result);
			break;
			}
			break;
		case 2:
			Collections.sort(bank.customer1, new SortByname());
			bank.displayCustomer();
		
			break;
		case 3:
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter amount to deposit");
			double amount=sc.nextDouble();
			System.out.println(bank.deposit(id, amount));
			break;
		case 4:
			System.out.println("enter id");
			int id1=sc.nextInt();
			System.out.println("enter amount to withdraw");
			double amount1=sc.nextDouble();
			try {
				System.out.println(bank.withdraw(id1, amount1));
			} catch (Insufficient_exception e1) {
				e1.printStackTrace();
			}
			break;
		case 5:
			System.out.println("enter from id");
			int fid=sc.nextInt();
			System.out.println("enter to id");
			int tid=sc.nextInt();
			System.out.println("enter amount");
			double amount2=sc.nextDouble();
			try {
				System.out.println(bank.transfer(fid, tid, amount2));
			} catch (Insufficient_exception e) {
				e.printStackTrace();
			}
			break;
		}
		
	}while(choice<6);
	}
}