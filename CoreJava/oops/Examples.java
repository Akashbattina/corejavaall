package oops;

public class Examples {
	
		int a ,b,c;
		Examples(){
			System.out.println("My Default constructor:");
		}
		Examples(int a,int b ,int c){
			this();
			this.a=a;
			this.b=b;
			this.c=c;
		}

		void msg() {
			System.out.println("Hii Hello");
		}
		//public void setdata(int a , int b,int c1) {
		//	
		//}
		public void displaydata() {
			this.msg();//rep a current method
			System.out.println("Value of a : "+a );
			System.out.println("Value of b : "+b );
			System.out.println("Value of c : "+c );
			
		}

			public static void main(String[] args) {
				Examples e = new Examples(1,2,4);
				//e.setdata(10, 10,20);
				e.displaydata();
			}

		

	 {
		

	}

}
