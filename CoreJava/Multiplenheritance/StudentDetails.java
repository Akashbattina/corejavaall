package Multiplenheritance;

public class StudentDetails implements ColleageDetails,HostelDetails{

	@Override
	public void methodHostelDetails() {
		System.out.println("The Hostel ");	}

	@Override
	public void methodColleagDetails() {
		System.out.println("The Colleage");
		
	}
	

}
