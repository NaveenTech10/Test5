package problems;

import java.util.ArrayList;
import java.util.HashSet;

//REMOVE DUPLICATE.....
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(2);
	System.out.print("THE LIST ELEMENTS ARE==>");
	System.out.println(list);
	HashSet set=new HashSet(list);
	System.out.print("REMOVE THE DUPLICATES ELEMENTS ==>");
	System.out.println(set);
	}

}
