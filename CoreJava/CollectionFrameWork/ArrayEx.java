package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Akash");                                       //Using Arrays
		al.add(1,"Arun");
		al.add(2,"Ashok");
		al.sort(Comparator.reverseOrder());
		System.out.println("Sorting:"+al);
	
		System.out.println("Elements in array:"+al);
		System.out.println("Element of array:"+al.get(1));
		System.out.println("Size of array:"+al.size());
	al.remove(2);
	
		ArrayList<Integer> ar=new ArrayList<>();                 //Using Integer
		ar.add(22);
		ar.add(34);
		System.out.println("Elements of Integer:"+ar);
		System.out.println("Elements of Integer:"+ar.get(1));
		
		LinkedList<String>l=new LinkedList();                //using linkedlist
		l.add("Sneha");
		l.add("Asmita");
		l.add(0, "Vaishanvi");
		l.add("Priya");
		l.add(" ");
		System.out.println("Elements in My LinkedList :"+l);
		System.out.println("Size Of My LinkedList :"+l.size());
		System.out.println("GetElements in My LinkedListt :"+l.get(1));
		l.remove(3);
		System.out.println("Elements in My LinkedList"+l);
		l.remove("Vaishanvi");
		System.out.println("Elements in My LinkedList"+l);
		l.set(2,"Pranali");
		System.out.println("Set in My LinkedList :"+l);
		
		LinkedList<String>l1=new LinkedList();
		l1.addAll(l);
		System.out.println("AllElements in My LinkedList :"+l1);
l.addFirst("akash");
		System.out.println(" AddFirst Elements in My LinkedList :"+l);
		l.addLast("sai");
		System.out.println(" AddLast Elements in My LinkedList :"+l);
		System.out.println(" getFirst Elements in My LinkedList :"+l.getFirst());
		System.out.println(" getLast Elements in My LinkedList :"+l.getLast());
		System.out.println(" PeekFirst Elements in My LinkedList :"+l.peekFirst());
		System.out.println(" PeekLast Elements in My LinkedList :"+l.peekLast());
		
	}
}
	

	