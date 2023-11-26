package problems;

import java.util.Scanner;
import java.util.TreeSet;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tt=new TreeSet();
		tt.add("Naveen");
		tt.add("Thilip");
		tt.add("Pope");
		tt.add("Siva");
		System.out.print("THE TREE SET ELEMENTS ARE==>");
		System.out.println(tt);
		System.out.println("ENTER THE ELEMENT");
		Scanner input=new Scanner(System.in);
		String removeElement=input.next();
		tt.remove(removeElement);
		System.out.print("AFTER REMOVING ==>");
		System.out.println(tt);
	}

}
