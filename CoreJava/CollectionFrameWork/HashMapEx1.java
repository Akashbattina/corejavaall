package CollectionFrameWork;


import java.util.HashMap;
import java.util.HashSet;             //Hashset doesnt allow duplicate names.   
import java.util.Iterator;
import java.util.TreeSet;              

public class HashMapEx1 {

	public static void main(String[] args) {
		TreeSet<String> name=new TreeSet<String>();
		name.add("Pooja");
		name.add("Akash");
	
		name.add("Chetan");
		name.add("Prudhvi");
		//System.out.println(name);
		name.add("ayush");
		
		System.out.println(name);
		System.out.println("Retrive data using iterator ");
		Iterator<String> itr=name.descendingIterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
			
		}
	}
}
