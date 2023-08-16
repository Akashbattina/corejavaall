import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
		h.add("ahsj");
		h.add("hdu");
		h.add("huh");
		System.out.println(h);
		int size=h.size();
		System.out.println(h.size());
		//h.remove("hdu");
		//h.clear();
		System.out.println("Updated one hashset:"+h);
		boolean b=h.contains("hdu");
		System.out.println("Contains 'hdu' " +b);
	}

}
