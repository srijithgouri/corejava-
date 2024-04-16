package Oops;

public class ThisandSuperkeyword {

	public static void main(String[] args) {
		B obj = new B();
		

	}

}
class A{
	public A(){
		super();
//		call the constructor of the super class
		System.out.println("X: in A");
	}
	public A(int n){
		super();
		System.out.println("X: in B int");
	}
}
class B extends A{
	public B(){
		super();
		System.out.println("X: in B");
	}
	public B(int n){
		super();
		System.out.println("X: in B int");
	}
}
