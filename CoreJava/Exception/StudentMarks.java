package Exception;

import java.util.Scanner;

public class StudentMarks {
	static void studentmarks(int marks) {
	
	if( marks<100) {
		System.out.println("pass");
	}
	else {
		throw new ArithmeticException("Fail");
		
	}

	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks :");
		int marks=sc.nextInt();
		studentmarks(marks);
		
	}

}

