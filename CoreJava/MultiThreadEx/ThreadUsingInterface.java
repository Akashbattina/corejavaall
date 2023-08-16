package MultiThreadEx;

class Thread1 implements Runnable { 
	

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {           //// Printing 1-5;
			System.out.println(i);

		}

	}
}

class Thread2 extends Thread {
	public void run() {              
		for (int i = 5; i <= 10; i++) {             //// Printing 5-10;
			System.out.println(i);

		}

	}
}
class Thread3 extends Thread {              //printing of 5 table 
	public void run() {
		System.out.println("Output of five table");
		int num=5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num +"*"+i+"="+num*i);

		}

	}
}
class Thread4 extends Thread{
	public void run() {
		System.out.println("EVEN AND ODD NUMBERS");
		for(int i =1; i<=20 ;i++) {             //using for loop we can print even num from 0 to 20.
			if(i%2 == 0) {
				System.out.print(i);
				}
				System.out.println();         //taken to print line  by line.
			}
	}
}
 class Thread5 extends Thread{
	 public void main() {
		 System.out.println("Fibonacci output");
		 int n1=0,n2=1,n3 ,count=5;             //adding num upto count 5.
		 for(int i=1;i<count;i++) {
			 n3=n1+n2;
			 System.out.println(n3);
			 n1=n2;
			 n2=n3;
			 
					 
			 
		 }
	 }
 }

class ThreadUsingInterface {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		Thread t1 = new Thread(t);
		t1.start();
		Thread2 t2 = new Thread2();
		// Thread t3=new Thread(t2);
		t2.start();
		Thread3 t3= new Thread3();
		t3.start();
        Thread4 t4=new Thread4();
        t4.start();
        Thread5 t5 =new Thread5();
        t5.start();
	}

}
