package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mobile{
	int Mobile;
	String mname,mbrand;
	
		public Mobile(int mobile, String mname, String mbrand) {           //Constructer created with sourcei
		super();
		Mobile = mobile;
		this.mname = mname;
		this.mbrand = mbrand;
	}

@Override
		public String toString() {              //ToString  created with Source
			return "Mobile [Mobile=" + Mobile + ", mname=" + mname + ", mbrand=" + mbrand + "]";
		}
		
	
	}
	class SortByname implements Comparator<Mobile>{          //class for name

		@Override
		public int compare(Mobile o1, Mobile o2) {
			// TODO Auto-generated method stub
			return o1.mname.compareTo(o2.mname);
		}
		
	}
	class  SortByMobile implements Comparator<Mobile>{             //class for mobile.

		@Override
		public int compare(Mobile o1, Mobile o2) {
			// TODO Auto-generated method stub
			return o1.Mobile-o2.Mobile;
		}
		
	}
	class SortByBrand implements Comparator<Mobile>{          //class for Brand.
		@Override
		public int compare(Mobile o1, Mobile o2) {
			// TODO Auto-generated method stub
			return o1.mbrand.compareTo(o2.mbrand);
		}
	}

public class PriorityQueueEx {
	public static void main(String[] args) {
		ArrayList<Mobile> m=new ArrayList();        //Object 
		m.add(new Mobile(1990,"Nokia","A"));
		m.add( new Mobile(2001,"Karbon","C"));
		m.add( new Mobile(2005,"Samsung","B"));
		m.add( new Mobile(2010,"Oppo","D"));
		m.add( new Mobile(2015,"Iphone","E"));
		
		Collections.sort(m,new SortByname());            //method for sorting by a mobile name.
		//Collections.sort(m,new SortByMobile());        //method for sorting by a mobile.
		//Collections.sort(m,new SortByBrand());         // method for sorintg by brand.
		for(int i=0;i<4;i++) {                    //for loop
			System.out.println(m.get(i));
		}	
	}}






	
