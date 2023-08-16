package MultiThreadEx;

 class MultiThred extends Thread {        //Thread means which works a multiple tasks at a time  is called a Thread.
	public  void run() {
		System.out.println("Running thread Name:"+ this.currentThread().getName());     //Running Programm.
		System.out.println("Running thread Priority:"+ this.currentThread().getPriority());
		

	}
	}
public class MultiThred1{
	public static void main(String[] args) {
		MultiThred m=new MultiThred();
		m.setName("Fisrt Thread");
		m.setPriority(Thread.MIN_PRIORITY);
		MultiThred m1=new MultiThred();
		m1.setName("Second Thread");
		m1.setPriority(Thread.MAX_PRIORITY);
		MultiThred m2= new MultiThred();
		m2.setName("Third Thread");
		m.start();             //Start Programm.
		m1.start();
		m2.start();
	}

}

