package CollectionFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {

	public static void main(String[] args) {
		Deque<Integer>qq=new ArrayDeque<Integer>();
qq.offer(2);
qq.offerFirst(1);
qq.offerLast(4);
System.out.println(qq); //qq=1,2,4;
int r=qq.pollLast();    //used for delate of last element. //4 is delated.
int r1=qq.pollFirst();//used for delate of first element.  //2 is delated.
System.out.println(r);
System.out.println(qq);
	}

}
