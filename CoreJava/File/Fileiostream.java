package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileiostream {          

	public static void main(String[] args) throws IOException {     
		try {
			FileInputStream f= new FileInputStream("File1.txt");
			int data;
			while
				((data=f.read())!=-1)
			{
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

	}

}
