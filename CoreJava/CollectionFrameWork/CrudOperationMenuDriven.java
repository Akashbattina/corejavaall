package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.attribute.standard.MediaPrintableArea;

class Learner{
	int lno;
	String lname,ldegree;
	
	

public Learner(int lno, String lname, String ldegree) { //Parametrized constructer.
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}


@Override                 //to string method.
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}

}


public class CrudOperationMenuDriven {

	public static void main(String[] args) {
	ArrayList<Learner> l=new ArrayList<Learner>();
	Scanner s=new Scanner(System.in);
	int choice;
	do {
		System.out.println("1.Insert Data");
		System.out.println("2.Display Data");
		System.out.println("Enter your choice");
		choice=s.nextInt();
		switch(choice){
		case 1:
		System.out.print("Enter lno");
		int lno=s.nextInt();
		System.out.print("Enter lname");
		String lname=s.next();
		System.out.print("Enter ldegree");
		String ldegree=s.next();
		l.add(new Learner(lno, lname, ldegree));
		
		break;
	
		
	
		case 2:
			Iterator<Learner>i=l.iterator();
		while(i.hasNext()) {
			Learner le=i.next();
			System.out.println(le);
		}
	}
			


	}while(choice!=0);           //while for not enter 0 values .
	}
}

	

