package Garbage;
public class GarbageColDemo {        
	 public GarbageColDemo(GarbageColDemo s1) {
		 
	}
public GarbageColDemo() { ////garbage collection example
    //garbage collection means clean or remove of un used memory data.
}
	
    public void finalize()
    {
        System.out.println ("Garbage Collection performed by JVM");
    }
    public static void main (String args[])
    {
    	GarbageColDemo s2 = new GarbageColDemo();
    	GarbageColDemo s1 = new GarbageColDemo(s2);
    	s2 = s1;

        System.gc();
    }

}
