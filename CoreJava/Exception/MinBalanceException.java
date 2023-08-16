package Exception;

import java.util.Scanner;

class MinBalanaceException extends Exception{
	String msg;
	public  MinBalanaceException(String msg)
	{
		super(msg);
	}
	
}

public class MinBalanceException {                          //Main class
	 static int Balance=1000;                                // we get output when we given below RS-1000/-

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);                         //Object 
		System.out.println("Enter the Amount");
		int amount = sc.nextInt();
		try {                                                            //Try block
			if(Balance<amount) { 
				throw new Exception("Insufficient balance is" +Balance);
			}
			else
			{
				System.out.println("pls take money:"+amount);
			}
		}
		catch(MinBalanaceException e)                                        //Catch Block
		{                                                                      //here (e) it means =Object 
			System.out.println(e);
		}
		
			finally {
			
				System.out.println("Thank you");
			}
	}
}
	
		
		
	


