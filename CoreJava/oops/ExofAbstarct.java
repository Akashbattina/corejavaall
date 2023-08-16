package oops;
abstract class Bat{
	abstract void sound();
}
class Ball extends Bat{


	@Override
	 public void sound() {
		System.out.println("The sound of bat is tuf");
		
	}
}
	class Carrom extends Bat{

		@Override
		 public void sound() {
			System.out.println("The sound of carrom is uff");			
		}
		
	}
public class ExofAbstarct {

	public static void main(String[] args) {
		Ball b=new Ball();
		b.sound();
		Carrom c=new Carrom();
		c.sound();
		
	}

}
