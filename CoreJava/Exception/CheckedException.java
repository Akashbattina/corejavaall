package Exception;     //The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

public class CheckedException  {         

	public static void main(String[] args) {
	try{                                    //Try block
    Class.forName("basic.AkashEx");
    //System.out.println("Claas found");
    
	}catch (ClassNotFoundException e) {     //Catch block
		System.out.println(e);
	}
}
	}


