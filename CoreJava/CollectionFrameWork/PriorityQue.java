package CollectionFrameWork;

import java.util.PriorityQueue;

public class PriorityQue {
	public static void main(String []args) {

	PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	pq.add(1);
    pq.add(8);  
    pq.add(6);  
    pq.add(4); 
    pq.add(2);  
    pq.add(2);
    pq.add(12);  
    pq.add(10);
    
    System.out.println("The max Priority Queue contents:");
  Integer I = null;
    while( (I = pq.poll()) != null) {                  //display the max PriorityQueue

    System.out.println(I + " ");
	}

	}
}

