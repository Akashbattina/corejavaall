import java.util.ArrayList;
import java.util.Collections;

public class ArrayEX {

	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<Integer>();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(1);
		i.add(0);
		Collections.sort(i);
		System.out.println(i);
	}

}
