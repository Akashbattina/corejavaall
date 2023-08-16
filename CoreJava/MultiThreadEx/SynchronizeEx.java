package MultiThreadEx;

class PowerNum {
		synchronized void displayPower(int num) {
			int temp = 1;               //printing powers using for loop.
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + "^" + i + "=" + num * temp);         //temp/power condition.
				temp = temp * num;
//				try {
//					Thread.sleep(200);          //time to take to print output. //without try and cacth also we can get the output..
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
				}

			}
		}
	

	class Power1 extends Thread {
		PowerNum p;

		Power1(PowerNum p) {         //Created a constucter.
			this.p = p;
		}

		public void run() {              //run method to print 3 powers .
			p.displayPower(3);

		}
	}		
		public class SynchronizeEx {

			public static void main(String[] args) {
				PowerNum p1=new PowerNum();
				Power1 power1=new Power1(p1);
				power1.start();                //Start method
				       
			}

		}


	


