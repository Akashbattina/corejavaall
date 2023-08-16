import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("Akash");
	l.add("Mahesh");
	l.add("Mani");
	System.out.println("LinkedList:"+l);
	l.addFirst("Poojitha");
	l.addLast("Yoga");
	System.out.println("Upadated Linkedlist"+l);
	l.removeFirst();
	System.out.println("Delating fisrt item"+l);
	
		

	}

}
