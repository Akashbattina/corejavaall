package Exception;

public class UnCheckedException {

	public static void main(String[] args) {
		try {                                //there is no 50 index num in int so,it prints cacth block
			int[]numbers= {1,2,3};                               //ArrayEx
			System.out.println(numbers[50]);
			int b=10/0;
			System.out.println(b);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {        	
System.out.println("Some error in code");
	}
		catch(ArithmeticException e){
			System.out.println("No error");
		}
    finally {
		System.out.println("The end");
	}
}

}

