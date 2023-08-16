package oops.Inheritence;
class Student{               //Super class
	String name="Akash";
	void display() {
		System.out.println(name);
	}
}
	
class Developer extends Student{     //Sub class
	String role="Full stack";
	void displayrole() {
		System.out.println(role);
	}
}
public class SingleInheritanceEx {
	public static void main(String[] args) {
		Developer d1 = new Developer();
		
			d1.display();
			d1.displayrole();
		}
		

		
	}


