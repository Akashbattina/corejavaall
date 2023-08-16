package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
public class FileEx {

	public static void main(String[] args) throws IOException{
		
		File f=new File("Listof Courses");
		boolean b=f.delete();
		boolean c=f.delete();
		System.out.println(b);
		System.out.println(c);
		
		
	if(f.createNewFile()) {    //createNewFile means ,it is a one type of method
			System.out.println("File is Created");
		}
		else {
			System.out.println("File is exist");
		}
	}
}

	

