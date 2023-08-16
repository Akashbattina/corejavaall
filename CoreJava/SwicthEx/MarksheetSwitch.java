package SwicthEx;
import java.util.Scanner;

		public class MarksheetSwitch {
			public static String printGrade(int score) {
				if(score<0 && score>100) {
					return "invalid";
				}
				//swicth statement
				switch (score/10) {
				case 10:
					return "a+";
					
				case 9:
					return "a";
				case 8:
					return "b+";
				case 7:
					return "b";
				default: return "f";
				}
			}
			

			public static void main(String[] args) {
				
		Scanner scanner=new Scanner(System.in);//object
		
		System.out.println("enter your score");

		int score=scanner.nextInt();
		//MarksheetSwitch m=new MarksheetSwitch();

		String result= printGrade(score);
		System.out.println("my grade:"+ result);

			}

		}
	


