package DeadLock;
class Message1{
	private int age;
	String name;
	public int getAge() {               //getter and setter.
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Message1(int age, String name) {          //Constructer.
		super();
		this.age = age;
		this.name = name;
	}
	
}
class WaitThread implements Runnable{
	private Meassage m;

	
	public WaitThread(Meassage m) {
		super();
		this.m = m;
	}


	@Override
	public void run() {


		
	}
}

public class MainApp {
	

	public static void main(String[] args) {
		

	}

}


