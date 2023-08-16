package CollectionFrameWork;

import java.util.*;

 class PriorityEx {
	int rno;
	String name;
	

	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	


	public PriorityEx(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}


	@Override
	public String toString() {
		
		return "Example [rno=" + rno + ", name=" + name + "]";
	}
	
	
	public int compareTo(PriorityEx x)
	{
		if(this.rno)
	}
	
 }

public class Example{
	public static void main(String[] args) {
		PriorityQueue<PriorityEx> p=new PriorityQueue<PriorityEx>();
		p.add(new PriorityEx(22,"Akash") );
		p.add(new PriorityEx(24,"Akas") );
		p.add(new PriorityEx(25,"Aka") );
		while(!p.isEmpty()) {
			System.out.println(p.remove());
		}
		
		
	}

}
