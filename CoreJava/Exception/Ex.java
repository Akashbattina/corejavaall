package Exception;

public class Ex {

	public static void main(String[] args) {
		try {
	String s="Akash";
	int a=Integer.parseInt(s);
	System.out.println(a);
		
	} catch(Exception e) {    //here try class is wrong so,it prints catch class 
		System.out.println("End");
	}
		
	}

}
