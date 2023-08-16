package oops;
abstract class Bird{                   //METHOD
	abstract void sound();
}
class Duck extends Bird{
	public void makesound() {
		
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("The sound that a Duck make:Quack");
		
	}
}
	class Owl extends Bird{
		

		@Override
		void sound() {
			System.out.println("The owl make sound like:Buck");
			
		}
	}
	
public class SoundEx {
	public static void main(String[] args) {
		Duck d=new Duck();
		d.sound();
		Owl o=new Owl();
		o.sound();
		
	}

}

