package oops;

public class PublicEx {
	public String s="Akash";
	public void display() {
		System.out.println("My name:"+s);
		
	}
     public static void main(String args[]) {
    	 PublicEx p=new PublicEx(); //object
    	 p.display();
     }
}


