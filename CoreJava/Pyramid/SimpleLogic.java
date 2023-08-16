package Pyramid;

import java.util.Scanner;
                                              //Output
public class SimpleLogic {                     //  1
	                                            //2 2
	                                             //1
	                                           // 2 2
	                                           //3 3 3 
	void printPattern(int n) {
		int rcount=1;
		for(int i=n;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.println("");
			}
			for(int j=1;j<rcount;j++) {
				System.out.println(rcount+"");
			}
			System.out.println();
			rcount++;
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	SimpleLogic s=new SimpleLogic();
	s.printPattern(a);
	s.printPattern(b);
	s.printPattern(c);
	}

}
