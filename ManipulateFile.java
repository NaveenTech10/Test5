package problems;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManipulateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  String content="1234"; 
		  File fs=new File("C:\\Users\\navee\\file\\text.txt");
		  FileOutputStream fos=new FileOutputStream(fs);
		  byte b[]=content.getBytes();
		  fos.write(b);
		  fos.close();
		  
		  FileInputStream fis=new FileInputStream(fs);
		 System.out.println("Byte of data"+fis.read());
		  int i;
		  while((i=fis.read())!=-1) { 
			  System.out.print((char)i);
			  }
		  fis.close();
}
	}