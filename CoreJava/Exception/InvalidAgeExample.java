package Exception;
	class InvalidAgeExample extends Exception{
		public InvalidAgeExample(String msg) {
			super(msg);
		}
		
	}
	public class InvalidAgeExample {
	    public String checkAge(int age) throws InvalidAgeExample {
	    	if(age>18) {
	    		return "valid age";
	    	}else {
	    		throw new InvalidAgeExample("invalid age");
	    	}
	    	
	    }
		public static void main(String[] args)  {
			InvalidAgeExample i=new InvalidAgeExample();
			try {
				String s=i.checkAge(24);
				System.out.println(s);
				
			} catch (InvalidAgeExample e) {
				System.out.println(e);
				
			}
			

		}

	}


	

