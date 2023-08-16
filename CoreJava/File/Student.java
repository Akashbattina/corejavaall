package File;

import java.io.File;
import java.io.IOException;

public class Student {

	public static void main(String[] args) throws IOException {
	File f=new File("C:/Users/ASUS/eclipse-workspace/JavaProgramms/CoreJava/File/Akash.txt"); 
	if(f.createNewFile()) {
		System.out.println("File created");
	}
	else {
		System.out.println("File exist");
	}
		
	}

}
