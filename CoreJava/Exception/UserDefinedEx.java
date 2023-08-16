package Exception;



public class UserDefinedEx {
	
		//static void  validateAge(int Age) {
			 void  validateAge(int age) {
			if(age<18) {
				System.out.println("Above 18 age are allowed");
			
			}
			else {
				throw new ArithmeticException("inavlid age for movie") ;
					
			}	
			 }
		 public  static void main(String[] args) {
			 UserDefinedEx u=new UserDefinedEx();
			 u.validateAge(12);
		 }
	}
	

	
			 	
		


