package problems;

import java.io.File;

public class FilePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fs=new File("C:\\Users\\navee\\eclipse-workspace\\Test5\\src\\problems");
		boolean valueRead=fs.canRead();
		System.out.println(valueRead);
		boolean valueWrite=fs.canWrite();
		System.out.println(valueWrite);
		
	}

}
