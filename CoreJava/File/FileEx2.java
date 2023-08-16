package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

public class FileEx2 {

	public static void main(String[] args) throws IOException {          //main method
		File f=new File("Akash3.txt");               
		if(f.createNewFile()){
			System.out.println("file created");
			
		}
		else {
			System.out.println("file exist");
		}
		
		
		

	}
}


