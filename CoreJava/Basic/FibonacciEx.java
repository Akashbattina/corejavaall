package Basic;

public class FibonacciEx {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=5;
		for(int i=0;i<count;i++) {    //Fibonacci ex
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
			
					
		}
			


