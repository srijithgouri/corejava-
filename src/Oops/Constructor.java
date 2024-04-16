package Oops;
// constructor is a special method its has same name as class name and its never return any thing

public class Constructor {

	public static void main(String[] args) {
		Man obj = new Man();
		Man obj1 = new Man(28,"srijithgouri");
//		obj1.setAge(28);
//		obj1.setName("Sri");
		System.out.println(obj.getName()+": "+obj.getAge());
		System.out.println(obj1.getName()+": "+obj1.getAge());
		
		
//			
		

	}

}
class Man{
	 
	private int age;
	private String name;
	
	public Man(){
		age=24;
		name="Srijith";
//		System.out.println("in constructor");
	}
	public Man(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
}
