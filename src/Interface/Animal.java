package Interface;

//Interface
interface Animal {
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig implements Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
public void sleep() {
 // The body of sleep() is provided here
 System.out.println("Zzzzz");
}
}

class Main {
public static void main(String[] args) {
 Pig myPig = new Pig();  // Create a Pig object
 myPig.animalSound();
 myPig.sleep();
}
}


/*Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)*/





