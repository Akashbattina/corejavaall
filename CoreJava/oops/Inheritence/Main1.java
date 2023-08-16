package oops.Inheritence;                   //Ex for how to use This keyword.

class Animal {          //Super class
	public void animalsound() {
		System.out.println("The animal makes a sound");
	}

}
class Dog extends Animal{         //Sub class
	public void animalsound() {
		super.animalsound();
		System.out.println("Dog sound");
	}
}

public class Main1{
	public static void main(String[] args) {
		Dog d=new Dog();
			d.animalsound();
		}
	}



