
public class Person3 { // normal example.

	public void Person3() {// constructor we can access from object name.constucter name
		System.out.println("Hi");
	}

	static void method1() {// Normal static method .Method we can access with a class name.method name.
		System.out.println("Hi i m  method 1 from static");

	}
	
	void method2() {
		System.out.println("Hi Im method 2 from non-static");
	}

	public static void main(String[] args) {
		Person3 p = new Person3();
		Person3.method1();

	}

}
