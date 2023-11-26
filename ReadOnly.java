package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("Naveen");
		list.add("Pope");
		list.add("Siva");
		list.add("Thilip");
		System.out.println(list);
		List unmodify = Collections.unmodifiableList(list);
		System.out.println(unmodify);
	}

}
