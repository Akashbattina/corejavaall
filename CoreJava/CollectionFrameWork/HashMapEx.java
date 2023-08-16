package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();            //In these hashmap the key value should be unique
		
		hm.put(1,"abc");
		hm.put(2,"Atr");
		hm.put(3,"huy");
		hm.put(3,"jiu");
		//hm.putIfAbsent(3,"huo");
		System.out.println("Print the values of :"+hm);	
	}
}
