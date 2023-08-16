import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {//Two data types and there is no add method .we use only put method to add the items.
		HashMap<String,Integer> h=new HashMap<>();
		h.put("India",2);
		h.put("Nigeria",1);
		h.put("Southafrica",1);
		//System.out.println(h);
		//h.replace("Pakistan",2);
		//h.replace("Pakistan", 1);
		//System.out.println(h);
	   //	h.remove("India");
	   //System.out.println(h);
		h.remove(h);
		System.out.println(h.remove(h));
		

	}

}
