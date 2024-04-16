package Bankproject;

public class Insufficient_exception extends Exception{
	public String toString(){
		return "insufficient funds";
	}
}