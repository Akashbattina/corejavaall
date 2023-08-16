package Basics2;
class Student{
	void addition(int a,int b) {
		System.out.println("addition of two num is :" +(a+b));
	}
	void subtraction(int c,int d) {
		System.out.println("subtraction of two num is :"+ (c-d));
	}
	void multiplication(int e, int f) {
		System.out.println("Multiplication of two num is :" +(e*f));
	}
	void division(int g,int h) {
		System.out.println("division of two num is :" +(g/h));
	}
}
public class Typesofmethodsforvoid {

	public static void main(String[] args) {
		Student so=new Student();
		so.addition(2, 4);
		so.subtraction(10, 5);
		so.multiplication(10, 20);
		so.division(10, 5);	
	}
}
