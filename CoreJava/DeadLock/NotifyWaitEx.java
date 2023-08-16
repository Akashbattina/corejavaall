package DeadLock;    // Deadlock in Java is a part of multithreading.
//• Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another 
//thread and second thread is waiting for an object lock that is acquired by first thread.
//• Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

class Meassage{                 //Message Class.1
	private String messsage;

	public String getMesssage() {          //getter and setter 
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	public Meassage(String messsage) {             //Constucter for Message.   
		super();
		this.messsage = messsage;
	}
}
	class WaitThread implements Runnable{          // WaitMethod class. 2
		private Meassage m;
		 WaitThread(Meassage m){       //constucter for message.
			 this.m=m;
		 }
		@Override
		public void run() {
			String s= Thread.currentThread().getName();
			synchronized (m) {
				System.out.println(s+"Waiting to get notified");
				try {
					m.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(s+"Get notified");
				System.out.println(s+"Thread is processed"+m.getMesssage());
				
			}
			
		}
	}
		class NotifyThread implements Runnable{          //Notify Class 3.
			private Meassage m;
			NotifyThread(Meassage m){          //Constructer for Notify
				this.m=m;
			}

				@Override
				public void run() {
					String s = Thread.currentThread().getName();
					
					System.out.println(s+"  :Started");
					try {
						Thread.sleep(100);            //Time taken to print output by a seconds.
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					synchronized(m) {
						m.setMesssage(s+" : Notifier ");
						m.notifyAll();
					}
				}

			}

			public class NotifyWaitEx {

				public static void main(String[] args) {            //In these main method we are calling  with objects.
					Meassage m1=new Meassage("Process Thread");    //obj for message
					WaitThread w=new WaitThread(m1);                //obj for WaitThread
					new Thread(w,"waitthread1").start();
					WaitThread w1=new WaitThread(m1);
					new Thread(w1,"waitthread2").start();
					NotifyThread n=new NotifyThread(m1);              //obj for NotifyThread.
					new Thread(n,"notify").start();
					System.out.println("all thread started");
					
				}

			}

		

	
			
			
			

			
		