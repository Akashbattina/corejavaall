package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutstream {
	public static void main(String[] args) throws IOException {
		String s="Mani";
		try {
			FileOutputStream fos=new FileOutputStream("File1.txt");
			
			byte[]b=s.getBytes();
			fos.write(b);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
