package oops;

class Student{
	int age=25;
	String name="Akash";
       void display() {
		System.out.println("name is : "+name+" age is "+ age);
	}
}
public class Hello {
  
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
	}

}
