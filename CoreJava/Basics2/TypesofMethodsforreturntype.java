package Basics2;

class Student2{
	int multiply(int a, int b) {
		return b*a;
		
	}
	float Division(int c, int d) {
		return c/d;
	}
	double addition(int x, int w) {
		return x+w;
	}
	Long subtraction(long e, long g) {
		return e-g;
	}
	int  addition2(int  r, int t) {
		return r+t;
	}
	

}
public class TypesofMethodsforreturntype {

	public static void main(String[] args) {
		Student2 so=new Student2 ();
System.out.println("multiplication of two numbers is " +so.multiply(2, 6));

System.out.println("Division of two numbers is : "+so.Division(10, 3));

System.out.println("Addition of two numbers is :"+so.addition(45, 6));
 
System.out.println("Subtraction of two numbers is :"+so.subtraction(60, 26));
 
System.out.println("addition2 of two numbers is :"+so.addition2(6, 2));
	}

}
