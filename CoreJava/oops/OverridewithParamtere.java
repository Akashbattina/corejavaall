package oops;

import oops.Userinput.Useraddition;

class Userinput{
	public void data(int a, int b) {
		System.out.println(a +b);
	}
	
	class Useraddition extends Userinput{
		public void data(int a ,int b) {
			System.out.println("sum of a+b");
			
		}
	}
}
public class OverridewithParamtere {

	public static void main(String[] args) {
		Userinput u=new Userinput();
		u.data(2, 4);

	}

}
