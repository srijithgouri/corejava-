package Bankproject;


import java.util.Comparator;

public class SortByname implements Comparator<Customer>{
	@Override
	public int compare(Customer name1, Customer name2) {
		String n1=name1.getFname();
		String n2=name2.getFname();
		return n1.compareTo(n2);
	}

	

}
