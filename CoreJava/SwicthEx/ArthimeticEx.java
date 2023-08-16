package SwicthEx;

public class ArthimeticEx {

	public static void main(String[] args) {
		
				String a = "Addition";
				int b=10,c=11;
				
				switch(a) {
				case "Subraction": System.out.println(b-c);
				break;
				case "Addition": System.out.println(b+c);
				break;
				case "Division": System.out.println(b/c);
				break;
				case "Remainder Operator": System.out.println(b%c);
				break;
				case "Multiplication": System.out.println(b*c);
				break;
				
				default:
					System.out.println("No Operation done");
				}
				
			}

		

	}

