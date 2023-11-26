package problems;

import java.util.HashSet;

public class SameValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("Naveen");
		set.add("Thilip");
		set.add("Vidhiya");
		set.add("Aakash");
		System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}
	}

}
