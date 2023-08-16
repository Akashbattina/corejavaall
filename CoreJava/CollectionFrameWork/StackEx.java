package CollectionFrameWork;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("Battina");
		s.push("Akash");
		System.out.println( "push output:"+s);
		s.pop();                                  //pop means it delates last name automatically..(FIFO)
		System.out.println("After poping:"+s);
		s.peek();                                //juat fisrt name taken for output.
		System.out.println("After peek:"+s);
		
		
	}

}
