package Inheriatance;

 abstract class AbstractAnimal{
	public abstract void bark();
}
 
 class Dog  extends AbstractAnimal {
	 public void bark() {
			System.out.println("Bow Bow");
		}
 }

public class Abstract {
	
	public static void main(String[] args) {
		 Dog dog =  new Dog();
		 dog.bark();
	}

}
