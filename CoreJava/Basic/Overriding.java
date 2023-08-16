package Basic;



class MethodOverriding {                         //Super class
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
		 System.out.println("5 months");
	 }
}
class learner extends MethodOverriding{          //Sub class
	 void course() {
		 super.course();
		 System.out.println("Hiii");
	 }
}

public class Overriding {

	public static void main(String[] args) {
		
		learner l=new learner();
		l.course();
		l.course2();
		l.courseduration();
		l.Courseduration2();
	}

}



