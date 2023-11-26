package problems;

import java.util.LinkedList;

//PRINT THE ELEMENTS IN LINKED LIST..
public class PositionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add("Naveen");
		list.add(1);
		list.add("Praveen");
		list.add(2);
		System.out.println("THE ELEMENTS IN THE LIST  ARE :::");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+" ");
		}
	}

}
