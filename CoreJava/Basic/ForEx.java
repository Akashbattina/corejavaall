package Basic;

public class ForEx {

	public static void main(String[] args) {
		int num=5;             //using for loop  5*4*3*2*1=120
		long factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial *=i;
		}
		System.out.println("Factorial is = "+factorial);
		int num1=5;                 //using while loop
		int fact=1;
		int i=1;
		while(i<=num1)
		{
			fact =fact *i;
			i++;
		}
		System.out.println("Fact="+factorial);
		}
	
		
	}

		
	

        

