package problems;

import java.io.File;

public class GetFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fs=new File("C:\\Users\\navee\\eclipse-workspace\\Test5\\src\\problems");
		String s[]=fs.list();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+" ");
		}
}

}
