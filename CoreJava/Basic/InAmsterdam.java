package Basic;

import java.util.Scanner;

class InAmsterdam {
	public int countAM(String s) {
		String str=s.toLowerCase();

		int cnt=0;
		String a[]=str.split("");
		for(int i=0; i<a.length;i++) {
			if(a[i].equals("am")) {
				cnt=cnt+1;
			}
			return cnt;
		}
		
	}
	public class Occurance{
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System .in); 
		String s=scan.nextLine();
		InAmsterdam a1=new InAmsterdam();
		int count =a1.countAM(s);
		System.out.println("Print count:"+count);
		
		
	}

	}

}
