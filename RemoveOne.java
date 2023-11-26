package problems;

import java.util.PriorityQueue;

public class RemoveOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue();
		pq.add("Naveen");
		pq.add("Thilip");
		pq.add("Pope");
		pq.add("Siva");
		System.out.print("BEFORE REMOVING==>");
		System.out.println(pq);
//		its only remove value based...
		pq.remove("Naveen");
		System.out.print("AFTER REMOVING ==>");
		System.out.println(pq);
	}
}
