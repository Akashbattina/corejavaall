package Multiplenheritance;

public class Child implements ABC,PQR {
	public static void main(String[] args) {
		Child c=new Child();
		c.methodABC();
		c.methodPQR();
		//c.methodXYZ();
		

	}

	@Override
	public void methodABC() {
		System.out.println("the method is ABC");
		
	}

	@Override
	public void methodPQR() {
		System.out.println("the method is PQR");		
	}

	//@Override
	//public void methodXYZ() {
		//System.out.println("the method is XYZ");
		
	}

	

