package Garbage;

public class FinalizeMethod1 {
	
String s;
	public FinalizeMethod1(String s) {
	super();
	this.s = s;
}
	public static void main(String[] args) {

		FinalizeMethod1 ob=new FinalizeMethod1("ob");
		FinalizeMethod1 ob1 =new FinalizeMethod1("ob1");
		ob=ob1;
		System.gc();
		}

}
