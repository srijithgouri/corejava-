package Oops;

public class Encapsulation {

	public static void main(String[] args) {
		Human obj = new Human();
//		System.out.println(obj.getName()+": "+obj.getAge());
		
		obj.setAge(24);
		obj.setName("Srijith");
		System.out.println(obj.getName()+": "+obj.getAge());

	}

}
class Human{
	private int age;
	private String name;
	
//	Here we get the data 
	public int getAge(){
		return age;
	}
//	Here we get the data 
	public String getName(){
		return name;
	}
//	Here we are setting the data
	public void setAge(int a){
		age=a;
	}
//	Here we are setting the data
	public void setName(String n){
		name=n;
	}
	
}
