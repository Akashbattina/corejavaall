package oops;
class learner{
	public void lname() {             //Super class//Parent class
		System.out.println("My name is Akash");
	}
	
  void course() {
	 System.out.println("Java full stack"); 
  }
  
  void courseduration() {
	  System.out.println("4 months");
  }
  void course2() {
	  System.out.println("Python");
  }
  void duration() {
	  System.out.println("2 months");
  }
 }
 class lcourse extends learner{              //Sub class//Child class
	 void course() {
		 super.course();
		 System.out.println("Data analytics"); 
	 } 
		 
	 }
	 
public class MethodOverridingEx {              //Main class
	public static void main(String[] args) {
	lcourse l=new lcourse();
	l.course();
	l.lname();	
	l.courseduration();
	l.course2();
	l.duration();
	}
	}



