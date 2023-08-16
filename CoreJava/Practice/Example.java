package Practice;

 class Example2{                         //Super class
	 public void name() {
		 System.out.println("My name is Akash");
	 }
	 void course() {
		 System.out.println("Java full stack");
	 }
	 void courseduration() {
		 System.out.println("5 months");
	 }
	 void course2() {
		 System.out.println("Python");
	 }
	 void Courseduration2() {
		 System.out.println("4 months");
	 }
 }
 class learner extends Example2{   

	 //Sub class
	 void course() {
		 System.out.println("hello");
		 super.course();
		 super.name();
	
	 }
	
 }
 public class Example{                  //main class
	public static void main(String[] args) {
		learner l=new learner();
		l.course();
		l.course2();
		l.name();
		l.courseduration();
		l.Courseduration2();
	}
}


