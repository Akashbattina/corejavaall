package oops.Inheritence;

import java.util.Scanner;

public class SinglewithConstructer {

	public static void main(String[] args) {
		//SuperClass 
		class Student {
			String name;

			Student(String nm) {
				name = nm;
				System.out.println(name);
			}
		}
	}
}
		//Subclass 
		class Developer1 extends Student {
			String role;
			String name;

			public Developer1(String role, String name) {

				super();
				this.role = role;
				System.out.println(role);
			}
		
	}
		public class SingleHeritance {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter Role ane Name");
				String role = scan.next();
				String name = scan.next();
				Developer1 d1 = new Developer1(role,name);
				
	}
		}

