package oops;
abstract class Vehicle1{
	
	public Vehicle1(){                    //Construtcer
		System.out.println("Constructer");
		//System.out.println("Brand");
	}
	abstract void  show();                //Abstract Method
	void vehiclebrand() {
		 System.out.println("Brand1");
		
		
	}
}
	class Bike extends Vehicle1{

		@Override
		void show() {
		
			System.out.println("bike");
		}
	}
	class car extends Vehicle1{

		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("car");
		}
		
	}

public class AbstarctMethod {
	public static void main(String[] args) {
		Vehicle1 v=new car();
		v.show();
		Vehicle1 b=new Bike();
		b.show();
		//Vehicle=new Brand();
		//v.show();

	}

}
