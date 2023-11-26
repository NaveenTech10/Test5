package problems;

import java.util.HashSet;

public class RetainSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet setOne=new HashSet();
		setOne.add("Naveen");
		setOne.add("Thilip");
		setOne.add("Pope");
		setOne.add("Siva");
		
		HashSet setTwo=new HashSet();
		setTwo.add("Naveen");
		setTwo.add("Thilip");
		setTwo.add("Pope");
		setTwo.add("Rama");
		setOne.retainAll(setTwo);
		System.out.print("THE COMMON ELEMENTS IN THE TWO SET IS==>");
		System.out.println(setOne);
	}

}
