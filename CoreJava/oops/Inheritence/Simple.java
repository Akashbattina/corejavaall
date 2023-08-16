package oops.Inheritence;
//Super class
	class Person {
		int age = 50;//Age as super
		int rno=67;
		public void display3() {
			// TODO Auto-generated method stub
			
		}
	}
//sub class
	public class Simple extends Person {
		int age = 30;//Instance variable

		void insertStudentAge() {
			int age = 20;//local variable
			System.out.println("Parent class: "+super.age);

			System.out.println("Local variable:"+age);
			System.out.println("Rollno :"+rno);

			System.out.println("Instance Variable:"+this.age); // 30
		}

		public static void main(String[] args) {

			Simple e = new Simple();
			System.out.println(e.age);
			e.insertStudentAge();

		}

	}