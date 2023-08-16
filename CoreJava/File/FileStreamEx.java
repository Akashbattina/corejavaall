package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamEx {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("D:/file2txt");       //Output Straem.
		String s="hello everyone";
		byte b[]=s.getBytes();
		fos.write(b);
		System.out.println("Content Written Succesfully");
		
//	FileInputStream fis =new FileInputStream("D:/file1txt");         //Input Stream.
//		String s1="Very bad morning ";
//		byte b1[]=s.getBytes();
//		fis.write(b1);
//		System.out.println("No content is added");
	}

}
